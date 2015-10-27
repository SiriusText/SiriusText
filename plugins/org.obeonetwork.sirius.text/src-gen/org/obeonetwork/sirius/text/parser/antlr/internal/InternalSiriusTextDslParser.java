package org.obeonetwork.sirius.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSiriusTextDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION", "RULE_ID", "RULE_STRING", "RULE_EXPRESSION", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'.'", "'.*'", "'import'", "'designer'", "'as'", "'{'", "'}'", "'viewpoint'", "'modelFileExtensions'", "'='", "'['", "','", "']'", "'icon'", "'representations'", "'javaExtensions'", "'@Initialized'", "'@ShowOnStartup'", "'@EnablePopupBars'", "'@MetamodelUris'", "'({'", "'})'", "'diagram'", "'for'", "'?'", "'documentation'", "'titleExpression'", "'rootExpression'", "'defaultLayer'", "'additionalLayers'", "'layer'", "'mappings'", "'edges'", "'sections'", "'section'", "'tools'", "'@ForceRefresh'", "'@NodeCreationVariable'", "'('", "')'", "'@ContainerViewVariable'", "'containerCreation'", "'containerMappings'", "'extraMappings'", "'begin'", "'changeContext'", "':'", "'if'", "'set'", "'featureName'", "'valueExpression'", "'unset'", "'elementExpression'", "'createInstance'", "'referenceName'", "'type'", "'createView'", "'mapping'", "'containerViewExpression'", "'createEdgeView'", "'sourceExpression'", "'targetExpression'", "'deleteView'", "'()'", "'remove'", "'move'", "'newContainerExpression'", "'switch'", "'case'", "'default'", "'list'", "'container'", "'style'", "'semanticCandidatesExpression'", "'gradient'", "'from'", "'to'", "'label'", "'in'", "'border'", "'size'", "'heightComputationExpression'", "'widthComputationExpression'", "'relationBasedEdge'", "'sourceMappings'", "'targetMappings'", "'targetFileExpression'", "'edgeStyle'", "'line'", "'routing'", "'sourceArrow'", "'targetArrow'", "'sizeComputationExpression'", "'foldingStyle'", "'endsCentering'", "'palette'", "'color'", "'rgb'", "'left'", "'center'", "'right'", "'oblique'", "'lefttoright'", "'toptobottom'", "'solid'", "'dash'", "'dot'", "'dash_dot'", "'straight'", "'manhattan'", "'tree'", "'NoDecoration'", "'OutputArrow'", "'InputArrow'", "'OutputClosedArrow'", "'InputClosedArrow'", "'OutputFillClosedArrow'", "'InputFillClosedArrow'", "'Diamond'", "'FillDiamond'", "'InputArrowWithDiamond'", "'InputArrowWithFillDiamond'", "'none'", "'source'", "'target'", "'both'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DOCUMENTATION=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSiriusTextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSiriusTextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSiriusTextDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSiriusTextDsl.g"; }



     	private SiriusTextDslGrammarAccess grammarAccess;
     	
        public InternalSiriusTextDslParser(TokenStream input, SiriusTextDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SiriusFile";	
       	}
       	
       	@Override
       	protected SiriusTextDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSiriusFile"
    // InternalSiriusTextDsl.g:68:1: entryRuleSiriusFile returns [EObject current=null] : iv_ruleSiriusFile= ruleSiriusFile EOF ;
    public final EObject entryRuleSiriusFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiriusFile = null;


        try {
            // InternalSiriusTextDsl.g:69:2: (iv_ruleSiriusFile= ruleSiriusFile EOF )
            // InternalSiriusTextDsl.g:70:2: iv_ruleSiriusFile= ruleSiriusFile EOF
            {
             newCompositeNode(grammarAccess.getSiriusFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiriusFile=ruleSiriusFile();

            state._fsp--;

             current =iv_ruleSiriusFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiriusFile"


    // $ANTLR start "ruleSiriusFile"
    // InternalSiriusTextDsl.g:77:1: ruleSiriusFile returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) ) ;
    public final EObject ruleSiriusFile() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:80:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) ) )
            // InternalSiriusTextDsl.g:81:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) )
            {
            // InternalSiriusTextDsl.g:81:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) )
            // InternalSiriusTextDsl.g:81:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) )
            {
            // InternalSiriusTextDsl.g:81:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOCUMENTATION) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSiriusTextDsl.g:82:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:82:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:83:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_3); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getSiriusFileAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSiriusFileRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getSiriusFileAccess().getPackageKeyword_1());
                
            // InternalSiriusTextDsl.g:103:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:104:1: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:104:1: (lv_name_2_0= ruleQualifiedName )
            // InternalSiriusTextDsl.g:105:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getSiriusFileAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:121:2: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:122:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalSiriusTextDsl.g:122:1: (lv_imports_3_0= ruleImport )
            	    // InternalSiriusTextDsl.g:123:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiriusFileAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSiriusTextDsl.g:139:3: ( (lv_body_4_0= ruleSiriusFileBody ) )
            // InternalSiriusTextDsl.g:140:1: (lv_body_4_0= ruleSiriusFileBody )
            {
            // InternalSiriusTextDsl.g:140:1: (lv_body_4_0= ruleSiriusFileBody )
            // InternalSiriusTextDsl.g:141:3: lv_body_4_0= ruleSiriusFileBody
            {
             
            	        newCompositeNode(grammarAccess.getSiriusFileAccess().getBodySiriusFileBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleSiriusFileBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.SiriusFileBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiriusFile"


    // $ANTLR start "entryRuleSiriusFileBody"
    // InternalSiriusTextDsl.g:165:1: entryRuleSiriusFileBody returns [EObject current=null] : iv_ruleSiriusFileBody= ruleSiriusFileBody EOF ;
    public final EObject entryRuleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiriusFileBody = null;


        try {
            // InternalSiriusTextDsl.g:166:2: (iv_ruleSiriusFileBody= ruleSiriusFileBody EOF )
            // InternalSiriusTextDsl.g:167:2: iv_ruleSiriusFileBody= ruleSiriusFileBody EOF
            {
             newCompositeNode(grammarAccess.getSiriusFileBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiriusFileBody=ruleSiriusFileBody();

            state._fsp--;

             current =iv_ruleSiriusFileBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiriusFileBody"


    // $ANTLR start "ruleSiriusFileBody"
    // InternalSiriusTextDsl.g:174:1: ruleSiriusFileBody returns [EObject current=null] : (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool ) ;
    public final EObject ruleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject this_Designer_0 = null;

        EObject this_Representation_1 = null;

        EObject this_Layer_2 = null;

        EObject this_Mapping_3 = null;

        EObject this_Style_4 = null;

        EObject this_Palette_5 = null;

        EObject this_Edge_6 = null;

        EObject this_Section_7 = null;

        EObject this_Tool_8 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:177:28: ( (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool ) )
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )
            {
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSiriusTextDsl.g:179:5: this_Designer_0= ruleDesigner
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getDesignerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Designer_0=ruleDesigner();

                    state._fsp--;

                     
                            current = this_Designer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:189:5: this_Representation_1= ruleRepresentation
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getRepresentationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Representation_1=ruleRepresentation();

                    state._fsp--;

                     
                            current = this_Representation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:199:5: this_Layer_2= ruleLayer
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getLayerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Layer_2=ruleLayer();

                    state._fsp--;

                     
                            current = this_Layer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:209:5: this_Mapping_3= ruleMapping
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getMappingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Mapping_3=ruleMapping();

                    state._fsp--;

                     
                            current = this_Mapping_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:219:5: this_Style_4= ruleStyle
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getStyleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Style_4=ruleStyle();

                    state._fsp--;

                     
                            current = this_Style_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:229:5: this_Palette_5= rulePalette
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getPaletteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Palette_5=rulePalette();

                    state._fsp--;

                     
                            current = this_Palette_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:239:5: this_Edge_6= ruleEdge
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getEdgeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Edge_6=ruleEdge();

                    state._fsp--;

                     
                            current = this_Edge_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:249:5: this_Section_7= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getSectionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Section_7=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:259:5: this_Tool_8= ruleTool
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getToolParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Tool_8=ruleTool();

                    state._fsp--;

                     
                            current = this_Tool_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiriusFileBody"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSiriusTextDsl.g:275:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSiriusTextDsl.g:276:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSiriusTextDsl.g:277:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSiriusTextDsl.g:284:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:287:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSiriusTextDsl.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSiriusTextDsl.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSiriusTextDsl.g:288:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSiriusTextDsl.g:295:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:296:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_4); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:316:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSiriusTextDsl.g:317:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSiriusTextDsl.g:318:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:325:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:328:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSiriusTextDsl.g:329:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSiriusTextDsl.g:329:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSiriusTextDsl.g:330:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalSiriusTextDsl.g:340:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSiriusTextDsl.g:341:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalSiriusTextDsl.g:354:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSiriusTextDsl.g:355:2: (iv_ruleImport= ruleImport EOF )
            // InternalSiriusTextDsl.g:356:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSiriusTextDsl.g:363:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:366:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSiriusTextDsl.g:367:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSiriusTextDsl.g:367:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSiriusTextDsl.g:367:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalSiriusTextDsl.g:371:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSiriusTextDsl.g:372:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSiriusTextDsl.g:372:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalSiriusTextDsl.g:373:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDesigner"
    // InternalSiriusTextDsl.g:397:1: entryRuleDesigner returns [EObject current=null] : iv_ruleDesigner= ruleDesigner EOF ;
    public final EObject entryRuleDesigner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesigner = null;


        try {
            // InternalSiriusTextDsl.g:398:2: (iv_ruleDesigner= ruleDesigner EOF )
            // InternalSiriusTextDsl.g:399:2: iv_ruleDesigner= ruleDesigner EOF
            {
             newCompositeNode(grammarAccess.getDesignerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesigner=ruleDesigner();

            state._fsp--;

             current =iv_ruleDesigner; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesigner"


    // $ANTLR start "ruleDesigner"
    // InternalSiriusTextDsl.g:406:1: ruleDesigner returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) ;
    public final EObject ruleDesigner() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_viewpoints_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:409:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) )
            // InternalSiriusTextDsl.g:410:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            {
            // InternalSiriusTextDsl.g:410:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            // InternalSiriusTextDsl.g:410:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}'
            {
            // InternalSiriusTextDsl.g:410:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCUMENTATION) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSiriusTextDsl.g:411:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:411:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:412:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_8); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getDesignerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getDesignerAccess().getDesignerKeyword_1());
                
            // InternalSiriusTextDsl.g:432:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:433:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:433:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:434:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDesignerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:450:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSiriusTextDsl.g:450:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getDesignerAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:454:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:455:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:455:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:456:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getDesignerAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

                	newLeafNode(otherlv_5, grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:476:1: ( (lv_viewpoints_6_0= ruleViewpoint ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOCUMENTATION||LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:477:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    {
            	    // InternalSiriusTextDsl.g:477:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    // InternalSiriusTextDsl.g:478:3: lv_viewpoints_6_0= ruleViewpoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDesignerAccess().getViewpointsViewpointParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_viewpoints_6_0=ruleViewpoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDesignerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"viewpoints",
            	            		lv_viewpoints_6_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Viewpoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesigner"


    // $ANTLR start "entryRuleViewpoint"
    // InternalSiriusTextDsl.g:506:1: entryRuleViewpoint returns [EObject current=null] : iv_ruleViewpoint= ruleViewpoint EOF ;
    public final EObject entryRuleViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpoint = null;


        try {
            // InternalSiriusTextDsl.g:507:2: (iv_ruleViewpoint= ruleViewpoint EOF )
            // InternalSiriusTextDsl.g:508:2: iv_ruleViewpoint= ruleViewpoint EOF
            {
             newCompositeNode(grammarAccess.getViewpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewpoint=ruleViewpoint();

            state._fsp--;

             current =iv_ruleViewpoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // InternalSiriusTextDsl.g:515:1: ruleViewpoint returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}' ) ;
    public final EObject ruleViewpoint() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_modelFileExtensions_9_0=null;
        Token otherlv_10=null;
        Token lv_modelFileExtensions_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_icon_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:518:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}' ) )
            // InternalSiriusTextDsl.g:519:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}' )
            {
            // InternalSiriusTextDsl.g:519:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}' )
            // InternalSiriusTextDsl.g:519:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}'
            {
            // InternalSiriusTextDsl.g:519:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOCUMENTATION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSiriusTextDsl.g:520:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:520:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:521:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_13); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getViewpointAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getViewpointAccess().getViewpointKeyword_1());
                
            // InternalSiriusTextDsl.g:541:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:542:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:542:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:543:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getViewpointAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewpointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:559:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSiriusTextDsl.g:559:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getViewpointAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:563:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:564:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:564:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:565:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getViewpointAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_14); 

                	newLeafNode(otherlv_5, grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:585:1: (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSiriusTextDsl.g:585:3: otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_15); 

                        	newLeafNode(otherlv_6, grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_7, grammarAccess.getViewpointAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_8=(Token)match(input,22,FOLLOW_10); 

                        	newLeafNode(otherlv_8, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:597:1: ( (lv_modelFileExtensions_9_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:598:1: (lv_modelFileExtensions_9_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:598:1: (lv_modelFileExtensions_9_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:599:3: lv_modelFileExtensions_9_0= RULE_STRING
                    {
                    lv_modelFileExtensions_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    			newLeafNode(lv_modelFileExtensions_9_0, grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"modelFileExtensions",
                            		lv_modelFileExtensions_9_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:615:2: (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:615:4: otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,23,FOLLOW_10); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getViewpointAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // InternalSiriusTextDsl.g:619:1: ( (lv_modelFileExtensions_11_0= RULE_STRING ) )
                    	    // InternalSiriusTextDsl.g:620:1: (lv_modelFileExtensions_11_0= RULE_STRING )
                    	    {
                    	    // InternalSiriusTextDsl.g:620:1: (lv_modelFileExtensions_11_0= RULE_STRING )
                    	    // InternalSiriusTextDsl.g:621:3: lv_modelFileExtensions_11_0= RULE_STRING
                    	    {
                    	    lv_modelFileExtensions_11_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    	    			newLeafNode(lv_modelFileExtensions_11_0, grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_4_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"modelFileExtensions",
                    	            		lv_modelFileExtensions_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_18); 

                        	newLeafNode(otherlv_12, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_5_5());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:641:3: (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSiriusTextDsl.g:641:5: otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_13, grammarAccess.getViewpointAccess().getIconKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_14, grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1());
                        
                    // InternalSiriusTextDsl.g:649:1: ( (lv_icon_15_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:650:1: (lv_icon_15_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:650:1: (lv_icon_15_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:651:3: lv_icon_15_0= RULE_STRING
                    {
                    lv_icon_15_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    			newLeafNode(lv_icon_15_0, grammarAccess.getViewpointAccess().getIconSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:667:4: (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSiriusTextDsl.g:667:6: otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']'
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_15); 

                        	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0());
                        
                    otherlv_17=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_17, grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_18=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_18, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2());
                        
                    // InternalSiriusTextDsl.g:679:1: ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSiriusTextDsl.g:679:2: ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:679:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:680:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:680:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:681:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getViewpointRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:694:2: (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==23) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:694:4: otherlv_20= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_20=(Token)match(input,23,FOLLOW_4); 

                            	        	newLeafNode(otherlv_20, grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:698:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:699:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:699:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:700:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getViewpointRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_22, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:717:3: (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSiriusTextDsl.g:717:5: otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']'
                    {
                    otherlv_23=(Token)match(input,27,FOLLOW_15); 

                        	newLeafNode(otherlv_23, grammarAccess.getViewpointAccess().getJavaExtensionsKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_24, grammarAccess.getViewpointAccess().getEqualsSignKeyword_8_1());
                        
                    otherlv_25=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_25, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_8_2());
                        
                    // InternalSiriusTextDsl.g:729:1: ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSiriusTextDsl.g:729:2: ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:729:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:730:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:730:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:731:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getViewpointRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getViewpointAccess().getJavaExtensionJvmTypeCrossReference_8_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:744:2: (otherlv_27= ',' ( ( ruleQualifiedName ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==23) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:744:4: otherlv_27= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_27=(Token)match(input,23,FOLLOW_4); 

                            	        	newLeafNode(otherlv_27, grammarAccess.getViewpointAccess().getCommaKeyword_8_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:748:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:749:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:749:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:750:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getViewpointRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getViewpointAccess().getJavaExtensionJvmTypeCrossReference_8_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,24,FOLLOW_22); 

                        	newLeafNode(otherlv_29, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_30, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleRepresentation"
    // InternalSiriusTextDsl.g:779:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // InternalSiriusTextDsl.g:780:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // InternalSiriusTextDsl.g:781:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepresentation"


    // $ANTLR start "ruleRepresentation"
    // InternalSiriusTextDsl.g:788:1: ruleRepresentation returns [EObject current=null] : this_Diagram_0= ruleDiagram ;
    public final EObject ruleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_Diagram_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:791:28: (this_Diagram_0= ruleDiagram )
            // InternalSiriusTextDsl.g:793:5: this_Diagram_0= ruleDiagram
            {
             
                    newCompositeNode(grammarAccess.getRepresentationAccess().getDiagramParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Diagram_0=ruleDiagram();

            state._fsp--;

             
                    current = this_Diagram_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleDiagram"
    // InternalSiriusTextDsl.g:809:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalSiriusTextDsl.g:810:2: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalSiriusTextDsl.g:811:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSiriusTextDsl.g:818:1: ruleDiagram returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_initialized_1_0=null;
        Token lv_showOnStartup_2_0=null;
        Token lv_enablePopupBars_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_metamodelUris_6_0=null;
        Token otherlv_7=null;
        Token lv_metamodelUris_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token lv_label_13_0=null;
        Token otherlv_14=null;
        Token lv_domainClass_15_0=null;
        Token otherlv_16=null;
        Token lv_precondition_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_endUserDocumentation_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_titleExpression_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_rootExpression_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:821:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) )
            // InternalSiriusTextDsl.g:822:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            {
            // InternalSiriusTextDsl.g:822:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            // InternalSiriusTextDsl.g:822:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}'
            {
            // InternalSiriusTextDsl.g:822:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOCUMENTATION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSiriusTextDsl.g:823:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:823:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:824:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_23); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getDiagramAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:840:3: ( (lv_initialized_1_0= '@Initialized' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSiriusTextDsl.g:841:1: (lv_initialized_1_0= '@Initialized' )
                    {
                    // InternalSiriusTextDsl.g:841:1: (lv_initialized_1_0= '@Initialized' )
                    // InternalSiriusTextDsl.g:842:3: lv_initialized_1_0= '@Initialized'
                    {
                    lv_initialized_1_0=(Token)match(input,28,FOLLOW_24); 

                            newLeafNode(lv_initialized_1_0, grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "initialized", true, "@Initialized");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:855:3: ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSiriusTextDsl.g:856:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    {
                    // InternalSiriusTextDsl.g:856:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    // InternalSiriusTextDsl.g:857:3: lv_showOnStartup_2_0= '@ShowOnStartup'
                    {
                    lv_showOnStartup_2_0=(Token)match(input,29,FOLLOW_25); 

                            newLeafNode(lv_showOnStartup_2_0, grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "showOnStartup", true, "@ShowOnStartup");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:870:3: ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSiriusTextDsl.g:871:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    {
                    // InternalSiriusTextDsl.g:871:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    // InternalSiriusTextDsl.g:872:3: lv_enablePopupBars_3_0= '@EnablePopupBars'
                    {
                    lv_enablePopupBars_3_0=(Token)match(input,30,FOLLOW_26); 

                            newLeafNode(lv_enablePopupBars_3_0, grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "enablePopupBars", true, "@EnablePopupBars");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:885:3: (otherlv_4= '@MetamodelUris' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:885:5: otherlv_4= '@MetamodelUris'
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_27); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_10); 

                	newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_5());
                
            // InternalSiriusTextDsl.g:893:1: ( (lv_metamodelUris_6_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:894:1: (lv_metamodelUris_6_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:894:1: (lv_metamodelUris_6_0= RULE_STRING )
            // InternalSiriusTextDsl.g:895:3: lv_metamodelUris_6_0= RULE_STRING
            {
            lv_metamodelUris_6_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            			newLeafNode(lv_metamodelUris_6_0, grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"metamodelUris",
                    		lv_metamodelUris_6_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:911:2: (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:911:4: otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_10); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDiagramAccess().getCommaKeyword_7_0());
            	        
            	    // InternalSiriusTextDsl.g:915:1: ( (lv_metamodelUris_8_0= RULE_STRING ) )
            	    // InternalSiriusTextDsl.g:916:1: (lv_metamodelUris_8_0= RULE_STRING )
            	    {
            	    // InternalSiriusTextDsl.g:916:1: (lv_metamodelUris_8_0= RULE_STRING )
            	    // InternalSiriusTextDsl.g:917:3: lv_metamodelUris_8_0= RULE_STRING
            	    {
            	    lv_metamodelUris_8_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	    			newLeafNode(lv_metamodelUris_8_0, grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDiagramRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"metamodelUris",
            	            		lv_metamodelUris_8_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_9=(Token)match(input,33,FOLLOW_29); 

                	newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,34,FOLLOW_4); 

                	newLeafNode(otherlv_10, grammarAccess.getDiagramAccess().getDiagramKeyword_9());
                
            // InternalSiriusTextDsl.g:941:1: ( (lv_name_11_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:942:1: (lv_name_11_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:942:1: (lv_name_11_0= RULE_ID )
            // InternalSiriusTextDsl.g:943:3: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            			newLeafNode(lv_name_11_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:959:2: (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSiriusTextDsl.g:959:4: otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_12, grammarAccess.getDiagramAccess().getAsKeyword_11_0());
                        
                    // InternalSiriusTextDsl.g:963:1: ( (lv_label_13_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:964:1: (lv_label_13_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:964:1: (lv_label_13_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:965:3: lv_label_13_0= RULE_STRING
                    {
                    lv_label_13_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    			newLeafNode(lv_label_13_0, grammarAccess.getDiagramAccess().getLabelSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,35,FOLLOW_10); 

                	newLeafNode(otherlv_14, grammarAccess.getDiagramAccess().getForKeyword_12());
                
            // InternalSiriusTextDsl.g:985:1: ( (lv_domainClass_15_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:986:1: (lv_domainClass_15_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:986:1: (lv_domainClass_15_0= RULE_STRING )
            // InternalSiriusTextDsl.g:987:3: lv_domainClass_15_0= RULE_STRING
            {
            lv_domainClass_15_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            			newLeafNode(lv_domainClass_15_0, grammarAccess.getDiagramAccess().getDomainClassSTRINGTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_15_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1003:2: (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSiriusTextDsl.g:1003:4: otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) )
                    {
                    otherlv_16=(Token)match(input,36,FOLLOW_33); 

                        	newLeafNode(otherlv_16, grammarAccess.getDiagramAccess().getQuestionMarkKeyword_14_0());
                        
                    // InternalSiriusTextDsl.g:1007:1: ( (lv_precondition_17_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1008:1: (lv_precondition_17_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1008:1: (lv_precondition_17_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1009:3: lv_precondition_17_0= RULE_EXPRESSION
                    {
                    lv_precondition_17_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_precondition_17_0, grammarAccess.getDiagramAccess().getPreconditionEXPRESSIONTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precondition",
                            		lv_precondition_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_34); 

                	newLeafNode(otherlv_18, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_15());
                
            // InternalSiriusTextDsl.g:1029:1: (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSiriusTextDsl.g:1029:3: otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,37,FOLLOW_15); 

                        	newLeafNode(otherlv_19, grammarAccess.getDiagramAccess().getDocumentationKeyword_16_0());
                        
                    otherlv_20=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_20, grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1());
                        
                    // InternalSiriusTextDsl.g:1037:1: ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1038:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1038:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1039:3: lv_endUserDocumentation_21_0= RULE_STRING
                    {
                    lv_endUserDocumentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    			newLeafNode(lv_endUserDocumentation_21_0, grammarAccess.getDiagramAccess().getEndUserDocumentationSTRINGTerminalRuleCall_16_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"endUserDocumentation",
                            		lv_endUserDocumentation_21_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1055:4: (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSiriusTextDsl.g:1055:6: otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    {
                    otherlv_22=(Token)match(input,38,FOLLOW_15); 

                        	newLeafNode(otherlv_22, grammarAccess.getDiagramAccess().getTitleExpressionKeyword_17_0());
                        
                    otherlv_23=(Token)match(input,21,FOLLOW_33); 

                        	newLeafNode(otherlv_23, grammarAccess.getDiagramAccess().getEqualsSignKeyword_17_1());
                        
                    // InternalSiriusTextDsl.g:1063:1: ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1064:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1064:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1065:3: lv_titleExpression_24_0= RULE_EXPRESSION
                    {
                    lv_titleExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_36); 

                    			newLeafNode(lv_titleExpression_24_0, grammarAccess.getDiagramAccess().getTitleExpressionEXPRESSIONTerminalRuleCall_17_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"titleExpression",
                            		lv_titleExpression_24_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1081:4: (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSiriusTextDsl.g:1081:6: otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    {
                    otherlv_25=(Token)match(input,39,FOLLOW_15); 

                        	newLeafNode(otherlv_25, grammarAccess.getDiagramAccess().getRootExpressionKeyword_18_0());
                        
                    otherlv_26=(Token)match(input,21,FOLLOW_33); 

                        	newLeafNode(otherlv_26, grammarAccess.getDiagramAccess().getEqualsSignKeyword_18_1());
                        
                    // InternalSiriusTextDsl.g:1089:1: ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1090:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1090:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1091:3: lv_rootExpression_27_0= RULE_EXPRESSION
                    {
                    lv_rootExpression_27_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_37); 

                    			newLeafNode(lv_rootExpression_27_0, grammarAccess.getDiagramAccess().getRootExpressionEXPRESSIONTerminalRuleCall_18_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rootExpression",
                            		lv_rootExpression_27_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1107:4: (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSiriusTextDsl.g:1107:6: otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) )
                    {
                    otherlv_28=(Token)match(input,40,FOLLOW_15); 

                        	newLeafNode(otherlv_28, grammarAccess.getDiagramAccess().getDefaultLayerKeyword_19_0());
                        
                    otherlv_29=(Token)match(input,21,FOLLOW_4); 

                        	newLeafNode(otherlv_29, grammarAccess.getDiagramAccess().getEqualsSignKeyword_19_1());
                        
                    // InternalSiriusTextDsl.g:1115:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1116:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1116:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1117:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 
                    	    
                    pushFollow(FOLLOW_38);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1130:4: (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSiriusTextDsl.g:1130:6: otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']'
                    {
                    otherlv_31=(Token)match(input,41,FOLLOW_15); 

                        	newLeafNode(otherlv_31, grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0());
                        
                    otherlv_32=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_32, grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1());
                        
                    otherlv_33=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_33, grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2());
                        
                    // InternalSiriusTextDsl.g:1142:1: ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1142:2: ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1142:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1143:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1143:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1144:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getDiagramRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1157:2: (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==23) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1157:4: otherlv_35= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_35=(Token)match(input,23,FOLLOW_4); 

                            	        	newLeafNode(otherlv_35, grammarAccess.getDiagramAccess().getCommaKeyword_20_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1161:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1162:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1162:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1163:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getDiagramRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_37=(Token)match(input,24,FOLLOW_22); 

                        	newLeafNode(otherlv_37, grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4());
                        

                    }
                    break;

            }

            otherlv_38=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_38, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_21());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleLayer"
    // InternalSiriusTextDsl.g:1192:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalSiriusTextDsl.g:1193:2: (iv_ruleLayer= ruleLayer EOF )
            // InternalSiriusTextDsl.g:1194:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalSiriusTextDsl.g:1201:1: ruleLayer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_icon_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1204:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' ) )
            // InternalSiriusTextDsl.g:1205:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' )
            {
            // InternalSiriusTextDsl.g:1205:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' )
            // InternalSiriusTextDsl.g:1205:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}'
            {
            // InternalSiriusTextDsl.g:1205:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_DOCUMENTATION) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSiriusTextDsl.g:1206:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1206:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1207:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_39); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getLayerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
                
            // InternalSiriusTextDsl.g:1227:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1228:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1228:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:1229:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_40); 

                	newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:1249:1: (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSiriusTextDsl.g:1249:3: otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getIconKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:1257:1: ( (lv_icon_6_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1258:1: (lv_icon_6_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1258:1: (lv_icon_6_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1259:3: lv_icon_6_0= RULE_STRING
                    {
                    lv_icon_6_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

                    			newLeafNode(lv_icon_6_0, grammarAccess.getLayerAccess().getIconSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_6_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1275:4: (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSiriusTextDsl.g:1275:6: otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_15); 

                        	newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getMappingsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayerAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_9=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_9, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:1287:1: ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1287:2: ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1287:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1288:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1288:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1289:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_5_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1302:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==23) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1302:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_11=(Token)match(input,23,FOLLOW_4); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getLayerAccess().getCommaKeyword_5_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1306:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1307:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1307:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1308:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_5_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,24,FOLLOW_42); 

                        	newLeafNode(otherlv_13, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1325:3: (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSiriusTextDsl.g:1325:5: otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']'
                    {
                    otherlv_14=(Token)match(input,44,FOLLOW_15); 

                        	newLeafNode(otherlv_14, grammarAccess.getLayerAccess().getEdgesKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_15, grammarAccess.getLayerAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_16=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_16, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_6_2());
                        
                    // InternalSiriusTextDsl.g:1337:1: ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1337:2: ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1337:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1338:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1338:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1339:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_6_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1352:2: (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==23) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1352:4: otherlv_18= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_18=(Token)match(input,23,FOLLOW_4); 

                            	        	newLeafNode(otherlv_18, grammarAccess.getLayerAccess().getCommaKeyword_6_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1356:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1357:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1357:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1358:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_6_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,24,FOLLOW_43); 

                        	newLeafNode(otherlv_20, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1375:3: (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSiriusTextDsl.g:1375:5: otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']'
                    {
                    otherlv_21=(Token)match(input,45,FOLLOW_15); 

                        	newLeafNode(otherlv_21, grammarAccess.getLayerAccess().getSectionsKeyword_7_0());
                        
                    otherlv_22=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_22, grammarAccess.getLayerAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_23=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_23, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7_2());
                        
                    // InternalSiriusTextDsl.g:1387:1: ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1387:2: ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1387:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1388:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1388:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1389:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getSectionsSectionCrossReference_7_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1402:2: (otherlv_25= ',' ( ( ruleQualifiedName ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==23) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1402:4: otherlv_25= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_25=(Token)match(input,23,FOLLOW_4); 

                            	        	newLeafNode(otherlv_25, grammarAccess.getLayerAccess().getCommaKeyword_7_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1406:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1407:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1407:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1408:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getSectionsSectionCrossReference_7_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_22); 

                        	newLeafNode(otherlv_27, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_28, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleSection"
    // InternalSiriusTextDsl.g:1437:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalSiriusTextDsl.g:1438:2: (iv_ruleSection= ruleSection EOF )
            // InternalSiriusTextDsl.g:1439:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalSiriusTextDsl.g:1446:1: ruleSection returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_icon_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1449:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' ) )
            // InternalSiriusTextDsl.g:1450:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' )
            {
            // InternalSiriusTextDsl.g:1450:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' )
            // InternalSiriusTextDsl.g:1450:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}'
            {
            // InternalSiriusTextDsl.g:1450:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DOCUMENTATION) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSiriusTextDsl.g:1451:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1451:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1452:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_44); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getSectionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
                
            // InternalSiriusTextDsl.g:1472:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1473:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1473:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:1474:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1490:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSiriusTextDsl.g:1490:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:1494:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1495:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1495:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1496:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getSectionAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_45); 

                	newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:1516:1: (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSiriusTextDsl.g:1516:3: otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getIconKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getEqualsSignKeyword_5_1());
                        
                    // InternalSiriusTextDsl.g:1524:1: ( (lv_icon_8_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1525:1: (lv_icon_8_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1525:1: (lv_icon_8_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1526:3: lv_icon_8_0= RULE_STRING
                    {
                    lv_icon_8_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

                    			newLeafNode(lv_icon_8_0, grammarAccess.getSectionAccess().getIconSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_8_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1542:4: (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSiriusTextDsl.g:1542:6: otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']'
                    {
                    otherlv_9=(Token)match(input,47,FOLLOW_15); 

                        	newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getToolsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_11=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_6_2());
                        
                    // InternalSiriusTextDsl.g:1554:1: ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_ID) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1554:2: ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1554:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1555:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1555:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1556:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getSectionRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getSectionAccess().getToolsToolCrossReference_6_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1569:2: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==23) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1569:4: otherlv_13= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_13=(Token)match(input,23,FOLLOW_4); 

                            	        	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getCommaKeyword_6_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1573:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1574:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1574:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1575:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getSectionRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getSectionAccess().getToolsToolCrossReference_6_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop49;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,24,FOLLOW_22); 

                        	newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_16, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleTool"
    // InternalSiriusTextDsl.g:1604:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalSiriusTextDsl.g:1605:2: (iv_ruleTool= ruleTool EOF )
            // InternalSiriusTextDsl.g:1606:2: iv_ruleTool= ruleTool EOF
            {
             newCompositeNode(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool=ruleTool();

            state._fsp--;

             current =iv_ruleTool; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // InternalSiriusTextDsl.g:1613:1: ruleTool returns [EObject current=null] : this_ContainerCreation_0= ruleContainerCreation ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerCreation_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1616:28: (this_ContainerCreation_0= ruleContainerCreation )
            // InternalSiriusTextDsl.g:1618:5: this_ContainerCreation_0= ruleContainerCreation
            {
             
                    newCompositeNode(grammarAccess.getToolAccess().getContainerCreationParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_ContainerCreation_0=ruleContainerCreation();

            state._fsp--;

             
                    current = this_ContainerCreation_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleContainerCreation"
    // InternalSiriusTextDsl.g:1634:1: entryRuleContainerCreation returns [EObject current=null] : iv_ruleContainerCreation= ruleContainerCreation EOF ;
    public final EObject entryRuleContainerCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerCreation = null;


        try {
            // InternalSiriusTextDsl.g:1635:2: (iv_ruleContainerCreation= ruleContainerCreation EOF )
            // InternalSiriusTextDsl.g:1636:2: iv_ruleContainerCreation= ruleContainerCreation EOF
            {
             newCompositeNode(grammarAccess.getContainerCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerCreation=ruleContainerCreation();

            state._fsp--;

             current =iv_ruleContainerCreation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerCreation"


    // $ANTLR start "ruleContainerCreation"
    // InternalSiriusTextDsl.g:1643:1: ruleContainerCreation returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' ) ;
    public final EObject ruleContainerCreation() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_forceRefresh_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nodeCreationVariable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_containerViewVariable_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token lv_label_13_0=null;
        Token otherlv_14=null;
        Token lv_precondition_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_icon_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        EObject lv_body_36_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1646:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' ) )
            // InternalSiriusTextDsl.g:1647:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' )
            {
            // InternalSiriusTextDsl.g:1647:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' )
            // InternalSiriusTextDsl.g:1647:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}'
            {
            // InternalSiriusTextDsl.g:1647:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DOCUMENTATION) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSiriusTextDsl.g:1648:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1648:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1649:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_47); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getContainerCreationAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1665:3: ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==48) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSiriusTextDsl.g:1666:1: (lv_forceRefresh_1_0= '@ForceRefresh' )
                    {
                    // InternalSiriusTextDsl.g:1666:1: (lv_forceRefresh_1_0= '@ForceRefresh' )
                    // InternalSiriusTextDsl.g:1667:3: lv_forceRefresh_1_0= '@ForceRefresh'
                    {
                    lv_forceRefresh_1_0=(Token)match(input,48,FOLLOW_48); 

                            newLeafNode(lv_forceRefresh_1_0, grammarAccess.getContainerCreationAccess().getForceRefreshForceRefreshKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(current, "forceRefresh", true, "@ForceRefresh");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,49,FOLLOW_49); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerCreationAccess().getNodeCreationVariableKeyword_2());
                
            otherlv_3=(Token)match(input,50,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerCreationAccess().getLeftParenthesisKeyword_3());
                
            // InternalSiriusTextDsl.g:1688:1: ( (lv_nodeCreationVariable_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:1689:1: (lv_nodeCreationVariable_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:1689:1: (lv_nodeCreationVariable_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:1690:3: lv_nodeCreationVariable_4_0= RULE_STRING
            {
            lv_nodeCreationVariable_4_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            			newLeafNode(lv_nodeCreationVariable_4_0, grammarAccess.getContainerCreationAccess().getNodeCreationVariableSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nodeCreationVariable",
                    		lv_nodeCreationVariable_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_51); 

                	newLeafNode(otherlv_5, grammarAccess.getContainerCreationAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,52,FOLLOW_49); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerCreationAccess().getContainerViewVariableKeyword_6());
                
            otherlv_7=(Token)match(input,50,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getContainerCreationAccess().getLeftParenthesisKeyword_7());
                
            // InternalSiriusTextDsl.g:1718:1: ( (lv_containerViewVariable_8_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:1719:1: (lv_containerViewVariable_8_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:1719:1: (lv_containerViewVariable_8_0= RULE_STRING )
            // InternalSiriusTextDsl.g:1720:3: lv_containerViewVariable_8_0= RULE_STRING
            {
            lv_containerViewVariable_8_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            			newLeafNode(lv_containerViewVariable_8_0, grammarAccess.getContainerCreationAccess().getContainerViewVariableSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewVariable",
                    		lv_containerViewVariable_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,51,FOLLOW_52); 

                	newLeafNode(otherlv_9, grammarAccess.getContainerCreationAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,53,FOLLOW_4); 

                	newLeafNode(otherlv_10, grammarAccess.getContainerCreationAccess().getContainerCreationKeyword_10());
                
            // InternalSiriusTextDsl.g:1744:1: ( (lv_name_11_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1745:1: (lv_name_11_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1745:1: (lv_name_11_0= RULE_ID )
            // InternalSiriusTextDsl.g:1746:3: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            			newLeafNode(lv_name_11_0, grammarAccess.getContainerCreationAccess().getNameIDTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1762:2: (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==16) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSiriusTextDsl.g:1762:4: otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_12, grammarAccess.getContainerCreationAccess().getAsKeyword_12_0());
                        
                    // InternalSiriusTextDsl.g:1766:1: ( (lv_label_13_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1767:1: (lv_label_13_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1767:1: (lv_label_13_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1768:3: lv_label_13_0= RULE_STRING
                    {
                    lv_label_13_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    			newLeafNode(lv_label_13_0, grammarAccess.getContainerCreationAccess().getLabelSTRINGTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1784:4: (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSiriusTextDsl.g:1784:6: otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) )
                    {
                    otherlv_14=(Token)match(input,36,FOLLOW_33); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainerCreationAccess().getQuestionMarkKeyword_13_0());
                        
                    // InternalSiriusTextDsl.g:1788:1: ( (lv_precondition_15_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1789:1: (lv_precondition_15_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1789:1: (lv_precondition_15_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1790:3: lv_precondition_15_0= RULE_EXPRESSION
                    {
                    lv_precondition_15_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_precondition_15_0, grammarAccess.getContainerCreationAccess().getPreconditionEXPRESSIONTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precondition",
                            		lv_precondition_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_54); 

                	newLeafNode(otherlv_16, grammarAccess.getContainerCreationAccess().getLeftCurlyBracketKeyword_14());
                
            // InternalSiriusTextDsl.g:1810:1: (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSiriusTextDsl.g:1810:3: otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_17, grammarAccess.getContainerCreationAccess().getIconKeyword_15_0());
                        
                    otherlv_18=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_18, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_15_1());
                        
                    // InternalSiriusTextDsl.g:1818:1: ( (lv_icon_19_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1819:1: (lv_icon_19_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1819:1: (lv_icon_19_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1820:3: lv_icon_19_0= RULE_STRING
                    {
                    lv_icon_19_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    			newLeafNode(lv_icon_19_0, grammarAccess.getContainerCreationAccess().getIconSTRINGTerminalRuleCall_15_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_19_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,54,FOLLOW_15); 

                	newLeafNode(otherlv_20, grammarAccess.getContainerCreationAccess().getContainerMappingsKeyword_16());
                
            otherlv_21=(Token)match(input,21,FOLLOW_16); 

                	newLeafNode(otherlv_21, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_17());
                
            otherlv_22=(Token)match(input,22,FOLLOW_20); 

                	newLeafNode(otherlv_22, grammarAccess.getContainerCreationAccess().getLeftSquareBracketKeyword_18());
                
            // InternalSiriusTextDsl.g:1848:1: ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSiriusTextDsl.g:1848:2: ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:1848:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1849:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1849:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1850:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getContainerMappingsMappingCrossReference_19_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:1863:2: (otherlv_24= ',' ( ( ruleQualifiedName ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==23) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:1863:4: otherlv_24= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_24=(Token)match(input,23,FOLLOW_4); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getContainerCreationAccess().getCommaKeyword_19_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:1867:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:1868:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:1868:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:1869:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getContainerMappingsMappingCrossReference_19_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_26=(Token)match(input,24,FOLLOW_56); 

                	newLeafNode(otherlv_26, grammarAccess.getContainerCreationAccess().getRightSquareBracketKeyword_20());
                
            // InternalSiriusTextDsl.g:1886:1: (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==55) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSiriusTextDsl.g:1886:3: otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']'
                    {
                    otherlv_27=(Token)match(input,55,FOLLOW_15); 

                        	newLeafNode(otherlv_27, grammarAccess.getContainerCreationAccess().getExtraMappingsKeyword_21_0());
                        
                    otherlv_28=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_28, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_21_1());
                        
                    otherlv_29=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_29, grammarAccess.getContainerCreationAccess().getLeftSquareBracketKeyword_21_2());
                        
                    // InternalSiriusTextDsl.g:1898:1: ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_ID) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1898:2: ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1898:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1899:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1899:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1900:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getContainerCreationRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getContainerCreationAccess().getExtraMappingsMappingCrossReference_21_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1913:2: (otherlv_31= ',' ( ( ruleQualifiedName ) ) )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==23) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1913:4: otherlv_31= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_31=(Token)match(input,23,FOLLOW_4); 

                            	        	newLeafNode(otherlv_31, grammarAccess.getContainerCreationAccess().getCommaKeyword_21_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1917:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1918:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1918:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1919:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getExtraMappingsMappingCrossReference_21_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop59;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_33=(Token)match(input,24,FOLLOW_57); 

                        	newLeafNode(otherlv_33, grammarAccess.getContainerCreationAccess().getRightSquareBracketKeyword_21_4());
                        

                    }
                    break;

            }

            otherlv_34=(Token)match(input,56,FOLLOW_11); 

                	newLeafNode(otherlv_34, grammarAccess.getContainerCreationAccess().getBeginKeyword_22());
                
            otherlv_35=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_35, grammarAccess.getContainerCreationAccess().getLeftCurlyBracketKeyword_23());
                
            // InternalSiriusTextDsl.g:1944:1: ( (lv_body_36_0= ruleOperation ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35||LA62_0==57||(LA62_0>=59 && LA62_0<=60)||LA62_0==63||LA62_0==65||LA62_0==68||LA62_0==71||LA62_0==74||(LA62_0>=76 && LA62_0<=77)||LA62_0==79) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSiriusTextDsl.g:1945:1: (lv_body_36_0= ruleOperation )
                    {
                    // InternalSiriusTextDsl.g:1945:1: (lv_body_36_0= ruleOperation )
                    // InternalSiriusTextDsl.g:1946:3: lv_body_36_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getBodyOperationParserRuleCall_24_0()); 
                    	    
                    pushFollow(FOLLOW_22);
                    lv_body_36_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerCreationRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_36_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_37=(Token)match(input,18,FOLLOW_22); 

                	newLeafNode(otherlv_37, grammarAccess.getContainerCreationAccess().getRightCurlyBracketKeyword_25());
                
            otherlv_38=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_38, grammarAccess.getContainerCreationAccess().getRightCurlyBracketKeyword_26());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerCreation"


    // $ANTLR start "entryRuleOperation"
    // InternalSiriusTextDsl.g:1978:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSiriusTextDsl.g:1979:2: (iv_ruleOperation= ruleOperation EOF )
            // InternalSiriusTextDsl.g:1980:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSiriusTextDsl.g:1987:1: ruleOperation returns [EObject current=null] : (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ChangeContext_0 = null;

        EObject this_For_1 = null;

        EObject this_If_2 = null;

        EObject this_Set_3 = null;

        EObject this_CreateInstance_4 = null;

        EObject this_CreateView_5 = null;

        EObject this_Unset_6 = null;

        EObject this_CreateEdgeView_7 = null;

        EObject this_DeleteView_8 = null;

        EObject this_Remove_9 = null;

        EObject this_Move_10 = null;

        EObject this_Switch_11 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1990:28: ( (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch ) )
            // InternalSiriusTextDsl.g:1991:1: (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch )
            {
            // InternalSiriusTextDsl.g:1991:1: (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch )
            int alt63=12;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt63=1;
                }
                break;
            case 35:
                {
                alt63=2;
                }
                break;
            case 59:
                {
                alt63=3;
                }
                break;
            case 60:
                {
                alt63=4;
                }
                break;
            case 65:
                {
                alt63=5;
                }
                break;
            case 68:
                {
                alt63=6;
                }
                break;
            case 63:
                {
                alt63=7;
                }
                break;
            case 71:
                {
                alt63=8;
                }
                break;
            case 74:
                {
                alt63=9;
                }
                break;
            case 76:
                {
                alt63=10;
                }
                break;
            case 77:
                {
                alt63=11;
                }
                break;
            case 79:
                {
                alt63=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalSiriusTextDsl.g:1992:5: this_ChangeContext_0= ruleChangeContext
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getChangeContextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ChangeContext_0=ruleChangeContext();

                    state._fsp--;

                     
                            current = this_ChangeContext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2002:5: this_For_1= ruleFor
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getForParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_For_1=ruleFor();

                    state._fsp--;

                     
                            current = this_For_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2012:5: this_If_2= ruleIf
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getIfParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_If_2=ruleIf();

                    state._fsp--;

                     
                            current = this_If_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:2022:5: this_Set_3= ruleSet
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getSetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Set_3=ruleSet();

                    state._fsp--;

                     
                            current = this_Set_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:2032:5: this_CreateInstance_4= ruleCreateInstance
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateInstanceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateInstance_4=ruleCreateInstance();

                    state._fsp--;

                     
                            current = this_CreateInstance_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:2042:5: this_CreateView_5= ruleCreateView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateViewParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateView_5=ruleCreateView();

                    state._fsp--;

                     
                            current = this_CreateView_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:2052:5: this_Unset_6= ruleUnset
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getUnsetParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Unset_6=ruleUnset();

                    state._fsp--;

                     
                            current = this_Unset_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:2062:5: this_CreateEdgeView_7= ruleCreateEdgeView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateEdgeViewParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateEdgeView_7=ruleCreateEdgeView();

                    state._fsp--;

                     
                            current = this_CreateEdgeView_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:2072:5: this_DeleteView_8= ruleDeleteView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getDeleteViewParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DeleteView_8=ruleDeleteView();

                    state._fsp--;

                     
                            current = this_DeleteView_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalSiriusTextDsl.g:2082:5: this_Remove_9= ruleRemove
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getRemoveParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Remove_9=ruleRemove();

                    state._fsp--;

                     
                            current = this_Remove_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalSiriusTextDsl.g:2092:5: this_Move_10= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getMoveParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Move_10=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalSiriusTextDsl.g:2102:5: this_Switch_11= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getSwitchParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Switch_11=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleChangeContext"
    // InternalSiriusTextDsl.g:2118:1: entryRuleChangeContext returns [EObject current=null] : iv_ruleChangeContext= ruleChangeContext EOF ;
    public final EObject entryRuleChangeContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeContext = null;


        try {
            // InternalSiriusTextDsl.g:2119:2: (iv_ruleChangeContext= ruleChangeContext EOF )
            // InternalSiriusTextDsl.g:2120:2: iv_ruleChangeContext= ruleChangeContext EOF
            {
             newCompositeNode(grammarAccess.getChangeContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeContext=ruleChangeContext();

            state._fsp--;

             current =iv_ruleChangeContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeContext"


    // $ANTLR start "ruleChangeContext"
    // InternalSiriusTextDsl.g:2127:1: ruleChangeContext returns [EObject current=null] : (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleChangeContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_browseExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2130:28: ( (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? ) )
            // InternalSiriusTextDsl.g:2131:1: (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? )
            {
            // InternalSiriusTextDsl.g:2131:1: (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? )
            // InternalSiriusTextDsl.g:2131:3: otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeContextAccess().getChangeContextKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_33); 

                	newLeafNode(otherlv_1, grammarAccess.getChangeContextAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2139:1: ( (lv_browseExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2140:1: (lv_browseExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2140:1: (lv_browseExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2141:3: lv_browseExpression_2_0= RULE_EXPRESSION
            {
            lv_browseExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_50); 

            			newLeafNode(lv_browseExpression_2_0, grammarAccess.getChangeContextAccess().getBrowseExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChangeContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"browseExpression",
                    		lv_browseExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_59); 

                	newLeafNode(otherlv_3, grammarAccess.getChangeContextAccess().getRightParenthesisKeyword_3());
                
            // InternalSiriusTextDsl.g:2161:1: (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==17) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSiriusTextDsl.g:2161:3: otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_4, grammarAccess.getChangeContextAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:2165:1: ( (lv_body_5_0= ruleOperation ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==35||LA64_0==57||(LA64_0>=59 && LA64_0<=60)||LA64_0==63||LA64_0==65||LA64_0==68||LA64_0==71||LA64_0==74||(LA64_0>=76 && LA64_0<=77)||LA64_0==79) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2166:1: (lv_body_5_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2166:1: (lv_body_5_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2167:3: lv_body_5_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChangeContextAccess().getBodyOperationParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_5_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChangeContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_5_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getChangeContextAccess().getRightCurlyBracketKeyword_4_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeContext"


    // $ANTLR start "entryRuleFor"
    // InternalSiriusTextDsl.g:2195:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalSiriusTextDsl.g:2196:2: (iv_ruleFor= ruleFor EOF )
            // InternalSiriusTextDsl.g:2197:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalSiriusTextDsl.g:2204:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_iteratorName_2_0=null;
        Token otherlv_3=null;
        Token lv_expression_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2207:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' ) )
            // InternalSiriusTextDsl.g:2208:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' )
            {
            // InternalSiriusTextDsl.g:2208:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' )
            // InternalSiriusTextDsl.g:2208:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2216:1: ( (lv_iteratorName_2_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2217:1: (lv_iteratorName_2_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2217:1: (lv_iteratorName_2_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2218:3: lv_iteratorName_2_0= RULE_STRING
            {
            lv_iteratorName_2_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            			newLeafNode(lv_iteratorName_2_0, grammarAccess.getForAccess().getIteratorNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"iteratorName",
                    		lv_iteratorName_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,58,FOLLOW_33); 

                	newLeafNode(otherlv_3, grammarAccess.getForAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2238:1: ( (lv_expression_4_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2239:1: (lv_expression_4_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2239:1: (lv_expression_4_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2240:3: lv_expression_4_0= RULE_EXPRESSION
            {
            lv_expression_4_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_50); 

            			newLeafNode(lv_expression_4_0, grammarAccess.getForAccess().getExpressionEXPRESSIONTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_11); 

                	newLeafNode(otherlv_5, grammarAccess.getForAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_6, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalSiriusTextDsl.g:2264:1: ( (lv_body_7_0= ruleOperation ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==35||LA66_0==57||(LA66_0>=59 && LA66_0<=60)||LA66_0==63||LA66_0==65||LA66_0==68||LA66_0==71||LA66_0==74||(LA66_0>=76 && LA66_0<=77)||LA66_0==79) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2265:1: (lv_body_7_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:2265:1: (lv_body_7_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:2266:3: lv_body_7_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForAccess().getBodyOperationParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_58);
            	    lv_body_7_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_7_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getForAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // InternalSiriusTextDsl.g:2294:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalSiriusTextDsl.g:2295:2: (iv_ruleIf= ruleIf EOF )
            // InternalSiriusTextDsl.g:2296:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalSiriusTextDsl.g:2303:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_conditionExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2306:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) )
            // InternalSiriusTextDsl.g:2307:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            {
            // InternalSiriusTextDsl.g:2307:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            // InternalSiriusTextDsl.g:2307:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_33); 

                	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2315:1: ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2316:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2316:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2317:3: lv_conditionExpression_2_0= RULE_EXPRESSION
            {
            lv_conditionExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_50); 

            			newLeafNode(lv_conditionExpression_2_0, grammarAccess.getIfAccess().getConditionExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIfRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionExpression",
                    		lv_conditionExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:2341:1: ( (lv_body_5_0= ruleOperation ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==35||LA67_0==57||(LA67_0>=59 && LA67_0<=60)||LA67_0==63||LA67_0==65||LA67_0==68||LA67_0==71||LA67_0==74||(LA67_0>=76 && LA67_0<=77)||LA67_0==79) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2342:1: (lv_body_5_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:2342:1: (lv_body_5_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:2343:3: lv_body_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfAccess().getBodyOperationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_58);
            	    lv_body_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_5_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleSet"
    // InternalSiriusTextDsl.g:2371:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalSiriusTextDsl.g:2372:2: (iv_ruleSet= ruleSet EOF )
            // InternalSiriusTextDsl.g:2373:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalSiriusTextDsl.g:2380:1: ruleSet returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_featureName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_valueExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2383:28: ( (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:2384:1: (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:2384:1: (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:2384:3: otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_61); 

                	newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,61,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getSetAccess().getFeatureNameKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getSetAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2400:1: ( (lv_featureName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2401:1: (lv_featureName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2401:1: (lv_featureName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2402:3: lv_featureName_4_0= RULE_STRING
            {
            lv_featureName_4_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            			newLeafNode(lv_featureName_4_0, grammarAccess.getSetAccess().getFeatureNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_63); 

                	newLeafNode(otherlv_5, grammarAccess.getSetAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,62,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getSetAccess().getValueExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_33); 

                	newLeafNode(otherlv_7, grammarAccess.getSetAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2430:1: ( (lv_valueExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2431:1: (lv_valueExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2431:1: (lv_valueExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2432:3: lv_valueExpression_8_0= RULE_EXPRESSION
            {
            lv_valueExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_50); 

            			newLeafNode(lv_valueExpression_8_0, grammarAccess.getSetAccess().getValueExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valueExpression",
                    		lv_valueExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,51,FOLLOW_59); 

                	newLeafNode(otherlv_9, grammarAccess.getSetAccess().getRightParenthesisKeyword_9());
                
            // InternalSiriusTextDsl.g:2452:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==17) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSiriusTextDsl.g:2452:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_10, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // InternalSiriusTextDsl.g:2456:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==35||LA68_0==57||(LA68_0>=59 && LA68_0<=60)||LA68_0==63||LA68_0==65||LA68_0==68||LA68_0==71||LA68_0==74||(LA68_0>=76 && LA68_0<=77)||LA68_0==79) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2457:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2457:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2458:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetAccess().getBodyOperationParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_10_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleUnset"
    // InternalSiriusTextDsl.g:2486:1: entryRuleUnset returns [EObject current=null] : iv_ruleUnset= ruleUnset EOF ;
    public final EObject entryRuleUnset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnset = null;


        try {
            // InternalSiriusTextDsl.g:2487:2: (iv_ruleUnset= ruleUnset EOF )
            // InternalSiriusTextDsl.g:2488:2: iv_ruleUnset= ruleUnset EOF
            {
             newCompositeNode(grammarAccess.getUnsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnset=ruleUnset();

            state._fsp--;

             current =iv_ruleUnset; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnset"


    // $ANTLR start "ruleUnset"
    // InternalSiriusTextDsl.g:2495:1: ruleUnset returns [EObject current=null] : (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleUnset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_featureName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_elementExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2498:28: ( (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:2499:1: (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:2499:1: (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:2499:3: otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getUnsetAccess().getUnsetKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_61); 

                	newLeafNode(otherlv_1, grammarAccess.getUnsetAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,61,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getUnsetAccess().getFeatureNameKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getUnsetAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2515:1: ( (lv_featureName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2516:1: (lv_featureName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2516:1: (lv_featureName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2517:3: lv_featureName_4_0= RULE_STRING
            {
            lv_featureName_4_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

            			newLeafNode(lv_featureName_4_0, grammarAccess.getUnsetAccess().getFeatureNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2533:2: (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==23) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSiriusTextDsl.g:2533:4: otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_65); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnsetAccess().getCommaKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,64,FOLLOW_60); 

                        	newLeafNode(otherlv_6, grammarAccess.getUnsetAccess().getElementExpressionKeyword_5_1());
                        
                    otherlv_7=(Token)match(input,58,FOLLOW_33); 

                        	newLeafNode(otherlv_7, grammarAccess.getUnsetAccess().getColonKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:2545:1: ( (lv_elementExpression_8_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:2546:1: (lv_elementExpression_8_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:2546:1: (lv_elementExpression_8_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:2547:3: lv_elementExpression_8_0= RULE_EXPRESSION
                    {
                    lv_elementExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_50); 

                    			newLeafNode(lv_elementExpression_8_0, grammarAccess.getUnsetAccess().getElementExpressionEXPRESSIONTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"elementExpression",
                            		lv_elementExpression_8_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,51,FOLLOW_59); 

                	newLeafNode(otherlv_9, grammarAccess.getUnsetAccess().getRightParenthesisKeyword_6());
                
            // InternalSiriusTextDsl.g:2567:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==17) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSiriusTextDsl.g:2567:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_10, grammarAccess.getUnsetAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // InternalSiriusTextDsl.g:2571:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==35||LA71_0==57||(LA71_0>=59 && LA71_0<=60)||LA71_0==63||LA71_0==65||LA71_0==68||LA71_0==71||LA71_0==74||(LA71_0>=76 && LA71_0<=77)||LA71_0==79) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2572:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2572:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2573:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUnsetAccess().getBodyOperationParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUnsetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getUnsetAccess().getRightCurlyBracketKeyword_7_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnset"


    // $ANTLR start "entryRuleCreateInstance"
    // InternalSiriusTextDsl.g:2601:1: entryRuleCreateInstance returns [EObject current=null] : iv_ruleCreateInstance= ruleCreateInstance EOF ;
    public final EObject entryRuleCreateInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateInstance = null;


        try {
            // InternalSiriusTextDsl.g:2602:2: (iv_ruleCreateInstance= ruleCreateInstance EOF )
            // InternalSiriusTextDsl.g:2603:2: iv_ruleCreateInstance= ruleCreateInstance EOF
            {
             newCompositeNode(grammarAccess.getCreateInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateInstance=ruleCreateInstance();

            state._fsp--;

             current =iv_ruleCreateInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateInstance"


    // $ANTLR start "ruleCreateInstance"
    // InternalSiriusTextDsl.g:2610:1: ruleCreateInstance returns [EObject current=null] : (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleCreateInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_referenceName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_type_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_variableName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_body_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2613:28: ( (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) )
            // InternalSiriusTextDsl.g:2614:1: (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            {
            // InternalSiriusTextDsl.g:2614:1: (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            // InternalSiriusTextDsl.g:2614:3: otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateInstanceAccess().getCreateInstanceKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_66); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateInstanceAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,66,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateInstanceAccess().getReferenceNameKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateInstanceAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2630:1: ( (lv_referenceName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2631:1: (lv_referenceName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2631:1: (lv_referenceName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2632:3: lv_referenceName_4_0= RULE_STRING
            {
            lv_referenceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            			newLeafNode(lv_referenceName_4_0, grammarAccess.getCreateInstanceAccess().getReferenceNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referenceName",
                    		lv_referenceName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_67); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateInstanceAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,67,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateInstanceAccess().getTypeKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateInstanceAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2660:1: ( (lv_type_8_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2661:1: (lv_type_8_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2661:1: (lv_type_8_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2662:3: lv_type_8_0= RULE_STRING
            {
            lv_type_8_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            			newLeafNode(lv_type_8_0, grammarAccess.getCreateInstanceAccess().getTypeSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,51,FOLLOW_68); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateInstanceAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,16,FOLLOW_10); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateInstanceAccess().getAsKeyword_10());
                
            // InternalSiriusTextDsl.g:2686:1: ( (lv_variableName_11_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2687:1: (lv_variableName_11_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2687:1: (lv_variableName_11_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2688:3: lv_variableName_11_0= RULE_STRING
            {
            lv_variableName_11_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            			newLeafNode(lv_variableName_11_0, grammarAccess.getCreateInstanceAccess().getVariableNameSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2704:2: (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==17) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSiriusTextDsl.g:2704:4: otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_12, grammarAccess.getCreateInstanceAccess().getLeftCurlyBracketKeyword_12_0());
                        
                    // InternalSiriusTextDsl.g:2708:1: ( (lv_body_13_0= ruleOperation ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==35||LA73_0==57||(LA73_0>=59 && LA73_0<=60)||LA73_0==63||LA73_0==65||LA73_0==68||LA73_0==71||LA73_0==74||(LA73_0>=76 && LA73_0<=77)||LA73_0==79) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2709:1: (lv_body_13_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2709:1: (lv_body_13_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2710:3: lv_body_13_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateInstanceAccess().getBodyOperationParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_13_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_13_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_14, grammarAccess.getCreateInstanceAccess().getRightCurlyBracketKeyword_12_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateInstance"


    // $ANTLR start "entryRuleCreateView"
    // InternalSiriusTextDsl.g:2738:1: entryRuleCreateView returns [EObject current=null] : iv_ruleCreateView= ruleCreateView EOF ;
    public final EObject entryRuleCreateView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateView = null;


        try {
            // InternalSiriusTextDsl.g:2739:2: (iv_ruleCreateView= ruleCreateView EOF )
            // InternalSiriusTextDsl.g:2740:2: iv_ruleCreateView= ruleCreateView EOF
            {
             newCompositeNode(grammarAccess.getCreateViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateView=ruleCreateView();

            state._fsp--;

             current =iv_ruleCreateView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateView"


    // $ANTLR start "ruleCreateView"
    // InternalSiriusTextDsl.g:2747:1: ruleCreateView returns [EObject current=null] : (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleCreateView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_containerViewExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_variableName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_body_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2750:28: ( (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) )
            // InternalSiriusTextDsl.g:2751:1: (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            {
            // InternalSiriusTextDsl.g:2751:1: (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            // InternalSiriusTextDsl.g:2751:3: otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateViewAccess().getCreateViewKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_69); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateViewAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,69,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateViewAccess().getMappingKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateViewAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2767:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:2768:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:2768:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:2769:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCreateViewAccess().getMappingMappingCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_62);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_70); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateViewAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,70,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateViewAccess().getContainerViewExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_33); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateViewAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2794:1: ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2795:1: (lv_containerViewExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2795:1: (lv_containerViewExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2796:3: lv_containerViewExpression_8_0= RULE_EXPRESSION
            {
            lv_containerViewExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_50); 

            			newLeafNode(lv_containerViewExpression_8_0, grammarAccess.getCreateViewAccess().getContainerViewExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewExpression",
                    		lv_containerViewExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,51,FOLLOW_68); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateViewAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,16,FOLLOW_10); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateViewAccess().getAsKeyword_10());
                
            // InternalSiriusTextDsl.g:2820:1: ( (lv_variableName_11_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2821:1: (lv_variableName_11_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2821:1: (lv_variableName_11_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2822:3: lv_variableName_11_0= RULE_STRING
            {
            lv_variableName_11_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            			newLeafNode(lv_variableName_11_0, grammarAccess.getCreateViewAccess().getVariableNameSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2838:2: (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==17) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalSiriusTextDsl.g:2838:4: otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_12, grammarAccess.getCreateViewAccess().getLeftCurlyBracketKeyword_12_0());
                        
                    // InternalSiriusTextDsl.g:2842:1: ( (lv_body_13_0= ruleOperation ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==35||LA75_0==57||(LA75_0>=59 && LA75_0<=60)||LA75_0==63||LA75_0==65||LA75_0==68||LA75_0==71||LA75_0==74||(LA75_0>=76 && LA75_0<=77)||LA75_0==79) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2843:1: (lv_body_13_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2843:1: (lv_body_13_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2844:3: lv_body_13_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateViewAccess().getBodyOperationParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_13_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_13_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_14, grammarAccess.getCreateViewAccess().getRightCurlyBracketKeyword_12_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateView"


    // $ANTLR start "entryRuleCreateEdgeView"
    // InternalSiriusTextDsl.g:2872:1: entryRuleCreateEdgeView returns [EObject current=null] : iv_ruleCreateEdgeView= ruleCreateEdgeView EOF ;
    public final EObject entryRuleCreateEdgeView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateEdgeView = null;


        try {
            // InternalSiriusTextDsl.g:2873:2: (iv_ruleCreateEdgeView= ruleCreateEdgeView EOF )
            // InternalSiriusTextDsl.g:2874:2: iv_ruleCreateEdgeView= ruleCreateEdgeView EOF
            {
             newCompositeNode(grammarAccess.getCreateEdgeViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateEdgeView=ruleCreateEdgeView();

            state._fsp--;

             current =iv_ruleCreateEdgeView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateEdgeView"


    // $ANTLR start "ruleCreateEdgeView"
    // InternalSiriusTextDsl.g:2881:1: ruleCreateEdgeView returns [EObject current=null] : (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? ) ;
    public final EObject ruleCreateEdgeView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_sourceExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_targetExpression_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_containerViewExpression_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_variableName_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_body_21_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2884:28: ( (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? ) )
            // InternalSiriusTextDsl.g:2885:1: (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? )
            {
            // InternalSiriusTextDsl.g:2885:1: (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? )
            // InternalSiriusTextDsl.g:2885:3: otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateEdgeViewAccess().getCreateEdgeViewKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_69); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateEdgeViewAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,69,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateEdgeViewAccess().getMappingKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2901:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:2902:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:2902:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:2903:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCreateEdgeViewAccess().getEdgeEdgeCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_62);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_71); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,72,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateEdgeViewAccess().getSourceExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_33); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2928:1: ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2929:1: (lv_sourceExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2929:1: (lv_sourceExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2930:3: lv_sourceExpression_8_0= RULE_EXPRESSION
            {
            lv_sourceExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_62); 

            			newLeafNode(lv_sourceExpression_8_0, grammarAccess.getCreateEdgeViewAccess().getSourceExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourceExpression",
                    		lv_sourceExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_72); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,73,FOLLOW_60); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateEdgeViewAccess().getTargetExpressionKeyword_10());
                
            otherlv_11=(Token)match(input,58,FOLLOW_33); 

                	newLeafNode(otherlv_11, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_11());
                
            // InternalSiriusTextDsl.g:2958:1: ( (lv_targetExpression_12_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2959:1: (lv_targetExpression_12_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2959:1: (lv_targetExpression_12_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2960:3: lv_targetExpression_12_0= RULE_EXPRESSION
            {
            lv_targetExpression_12_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_62); 

            			newLeafNode(lv_targetExpression_12_0, grammarAccess.getCreateEdgeViewAccess().getTargetExpressionEXPRESSIONTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetExpression",
                    		lv_targetExpression_12_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_13=(Token)match(input,23,FOLLOW_70); 

                	newLeafNode(otherlv_13, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_13());
                
            otherlv_14=(Token)match(input,70,FOLLOW_60); 

                	newLeafNode(otherlv_14, grammarAccess.getCreateEdgeViewAccess().getContainerViewExpressionKeyword_14());
                
            otherlv_15=(Token)match(input,58,FOLLOW_33); 

                	newLeafNode(otherlv_15, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_15());
                
            // InternalSiriusTextDsl.g:2988:1: ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2989:1: (lv_containerViewExpression_16_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2989:1: (lv_containerViewExpression_16_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2990:3: lv_containerViewExpression_16_0= RULE_EXPRESSION
            {
            lv_containerViewExpression_16_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_50); 

            			newLeafNode(lv_containerViewExpression_16_0, grammarAccess.getCreateEdgeViewAccess().getContainerViewExpressionEXPRESSIONTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewExpression",
                    		lv_containerViewExpression_16_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_17=(Token)match(input,51,FOLLOW_68); 

                	newLeafNode(otherlv_17, grammarAccess.getCreateEdgeViewAccess().getRightParenthesisKeyword_17());
                
            otherlv_18=(Token)match(input,16,FOLLOW_10); 

                	newLeafNode(otherlv_18, grammarAccess.getCreateEdgeViewAccess().getAsKeyword_18());
                
            // InternalSiriusTextDsl.g:3014:1: ( (lv_variableName_19_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3015:1: (lv_variableName_19_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3015:1: (lv_variableName_19_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3016:3: lv_variableName_19_0= RULE_STRING
            {
            lv_variableName_19_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            			newLeafNode(lv_variableName_19_0, grammarAccess.getCreateEdgeViewAccess().getVariableNameSTRINGTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_19_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:3032:2: (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==17) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSiriusTextDsl.g:3032:4: otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}'
                    {
                    otherlv_20=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_20, grammarAccess.getCreateEdgeViewAccess().getLeftCurlyBracketKeyword_20_0());
                        
                    // InternalSiriusTextDsl.g:3036:1: ( (lv_body_21_0= ruleOperation ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==35||LA77_0==57||(LA77_0>=59 && LA77_0<=60)||LA77_0==63||LA77_0==65||LA77_0==68||LA77_0==71||LA77_0==74||(LA77_0>=76 && LA77_0<=77)||LA77_0==79) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3037:1: (lv_body_21_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3037:1: (lv_body_21_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3038:3: lv_body_21_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateEdgeViewAccess().getBodyOperationParserRuleCall_20_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_21_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateEdgeViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_21_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_22, grammarAccess.getCreateEdgeViewAccess().getRightCurlyBracketKeyword_20_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateEdgeView"


    // $ANTLR start "entryRuleDeleteView"
    // InternalSiriusTextDsl.g:3066:1: entryRuleDeleteView returns [EObject current=null] : iv_ruleDeleteView= ruleDeleteView EOF ;
    public final EObject entryRuleDeleteView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteView = null;


        try {
            // InternalSiriusTextDsl.g:3067:2: (iv_ruleDeleteView= ruleDeleteView EOF )
            // InternalSiriusTextDsl.g:3068:2: iv_ruleDeleteView= ruleDeleteView EOF
            {
             newCompositeNode(grammarAccess.getDeleteViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteView=ruleDeleteView();

            state._fsp--;

             current =iv_ruleDeleteView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteView"


    // $ANTLR start "ruleDeleteView"
    // InternalSiriusTextDsl.g:3075:1: ruleDeleteView returns [EObject current=null] : ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleDeleteView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3078:28: ( ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) )
            // InternalSiriusTextDsl.g:3079:1: ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            {
            // InternalSiriusTextDsl.g:3079:1: ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            // InternalSiriusTextDsl.g:3079:2: () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            {
            // InternalSiriusTextDsl.g:3079:2: ()
            // InternalSiriusTextDsl.g:3080:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeleteViewAccess().getDeleteViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FOLLOW_73); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteViewAccess().getDeleteViewKeyword_1());
                
            otherlv_2=(Token)match(input,75,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getDeleteViewAccess().getLeftParenthesisRightParenthesisKeyword_2());
                
            // InternalSiriusTextDsl.g:3093:1: (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==17) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSiriusTextDsl.g:3093:3: otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeleteViewAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:3097:1: ( (lv_body_4_0= ruleOperation ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==35||LA79_0==57||(LA79_0>=59 && LA79_0<=60)||LA79_0==63||LA79_0==65||LA79_0==68||LA79_0==71||LA79_0==74||(LA79_0>=76 && LA79_0<=77)||LA79_0==79) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3098:1: (lv_body_4_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3098:1: (lv_body_4_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3099:3: lv_body_4_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeleteViewAccess().getBodyOperationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_4_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_4_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getDeleteViewAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteView"


    // $ANTLR start "entryRuleRemove"
    // InternalSiriusTextDsl.g:3127:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalSiriusTextDsl.g:3128:2: (iv_ruleRemove= ruleRemove EOF )
            // InternalSiriusTextDsl.g:3129:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalSiriusTextDsl.g:3136:1: ruleRemove returns [EObject current=null] : ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3139:28: ( ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) )
            // InternalSiriusTextDsl.g:3140:1: ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            {
            // InternalSiriusTextDsl.g:3140:1: ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            // InternalSiriusTextDsl.g:3140:2: () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            {
            // InternalSiriusTextDsl.g:3140:2: ()
            // InternalSiriusTextDsl.g:3141:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRemoveAccess().getRemoveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FOLLOW_73); 

                	newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getRemoveKeyword_1());
                
            otherlv_2=(Token)match(input,75,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getLeftParenthesisRightParenthesisKeyword_2());
                
            // InternalSiriusTextDsl.g:3154:1: (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==17) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSiriusTextDsl.g:3154:3: otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_3, grammarAccess.getRemoveAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:3158:1: ( (lv_body_4_0= ruleOperation ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==35||LA81_0==57||(LA81_0>=59 && LA81_0<=60)||LA81_0==63||LA81_0==65||LA81_0==68||LA81_0==71||LA81_0==74||(LA81_0>=76 && LA81_0<=77)||LA81_0==79) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3159:1: (lv_body_4_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3159:1: (lv_body_4_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3160:3: lv_body_4_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRemoveAccess().getBodyOperationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_4_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRemoveRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_4_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleMove"
    // InternalSiriusTextDsl.g:3188:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalSiriusTextDsl.g:3189:2: (iv_ruleMove= ruleMove EOF )
            // InternalSiriusTextDsl.g:3190:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalSiriusTextDsl.g:3197:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_newContainerExpression_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_featureName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3200:28: ( (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:3201:1: (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:3201:1: (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:3201:3: otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,77,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_74); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,78,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getNewContainerExpressionKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_33); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:3217:1: ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:3218:1: (lv_newContainerExpression_4_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:3218:1: (lv_newContainerExpression_4_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:3219:3: lv_newContainerExpression_4_0= RULE_EXPRESSION
            {
            lv_newContainerExpression_4_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_62); 

            			newLeafNode(lv_newContainerExpression_4_0, grammarAccess.getMoveAccess().getNewContainerExpressionEXPRESSIONTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newContainerExpression",
                    		lv_newContainerExpression_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_61); 

                	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,61,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getFeatureNameKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:3247:1: ( (lv_featureName_8_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3248:1: (lv_featureName_8_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3248:1: (lv_featureName_8_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3249:3: lv_featureName_8_0= RULE_STRING
            {
            lv_featureName_8_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            			newLeafNode(lv_featureName_8_0, grammarAccess.getMoveAccess().getFeatureNameSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,51,FOLLOW_59); 

                	newLeafNode(otherlv_9, grammarAccess.getMoveAccess().getRightParenthesisKeyword_9());
                
            // InternalSiriusTextDsl.g:3269:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==17) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalSiriusTextDsl.g:3269:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_10, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // InternalSiriusTextDsl.g:3273:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==35||LA83_0==57||(LA83_0>=59 && LA83_0<=60)||LA83_0==63||LA83_0==65||LA83_0==68||LA83_0==71||LA83_0==74||(LA83_0>=76 && LA83_0<=77)||LA83_0==79) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3274:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3274:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3275:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMoveAccess().getBodyOperationParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMoveRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_10_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleSwitch"
    // InternalSiriusTextDsl.g:3303:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalSiriusTextDsl.g:3304:2: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalSiriusTextDsl.g:3305:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalSiriusTextDsl.g:3312:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_cases_2_0 = null;

        EObject lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3315:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) )
            // InternalSiriusTextDsl.g:3316:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            {
            // InternalSiriusTextDsl.g:3316:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            // InternalSiriusTextDsl.g:3316:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_75); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalSiriusTextDsl.g:3324:1: ( (lv_cases_2_0= ruleCase ) )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==80) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3325:1: (lv_cases_2_0= ruleCase )
            	    {
            	    // InternalSiriusTextDsl.g:3325:1: (lv_cases_2_0= ruleCase )
            	    // InternalSiriusTextDsl.g:3326:3: lv_cases_2_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchAccess().getCasesCaseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_76);
            	    lv_cases_2_0=ruleCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_2_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Case");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);

            // InternalSiriusTextDsl.g:3342:3: ( (lv_default_3_0= ruleDefault ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==81) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSiriusTextDsl.g:3343:1: (lv_default_3_0= ruleDefault )
                    {
                    // InternalSiriusTextDsl.g:3343:1: (lv_default_3_0= ruleDefault )
                    // InternalSiriusTextDsl.g:3344:3: lv_default_3_0= ruleDefault
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultDefaultParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_22);
                    lv_default_3_0=ruleDefault();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_3_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Default");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleCase"
    // InternalSiriusTextDsl.g:3372:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSiriusTextDsl.g:3373:2: (iv_ruleCase= ruleCase EOF )
            // InternalSiriusTextDsl.g:3374:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalSiriusTextDsl.g:3381:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_conditionExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3384:28: ( (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) )
            // InternalSiriusTextDsl.g:3385:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            {
            // InternalSiriusTextDsl.g:3385:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            // InternalSiriusTextDsl.g:3385:3: otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_33); 

                	newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:3393:1: ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:3394:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:3394:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:3395:3: lv_conditionExpression_2_0= RULE_EXPRESSION
            {
            lv_conditionExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_50); 

            			newLeafNode(lv_conditionExpression_2_0, grammarAccess.getCaseAccess().getConditionExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionExpression",
                    		lv_conditionExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:3419:1: ( (lv_body_5_0= ruleOperation ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==35||LA87_0==57||(LA87_0>=59 && LA87_0<=60)||LA87_0==63||LA87_0==65||LA87_0==68||LA87_0==71||LA87_0==74||(LA87_0>=76 && LA87_0<=77)||LA87_0==79) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3420:1: (lv_body_5_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:3420:1: (lv_body_5_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:3421:3: lv_body_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getBodyOperationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_58);
            	    lv_body_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_5_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getCaseAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleDefault"
    // InternalSiriusTextDsl.g:3449:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalSiriusTextDsl.g:3450:2: (iv_ruleDefault= ruleDefault EOF )
            // InternalSiriusTextDsl.g:3451:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalSiriusTextDsl.g:3458:1: ruleDefault returns [EObject current=null] : ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3461:28: ( ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' ) )
            // InternalSiriusTextDsl.g:3462:1: ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' )
            {
            // InternalSiriusTextDsl.g:3462:1: ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' )
            // InternalSiriusTextDsl.g:3462:2: () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}'
            {
            // InternalSiriusTextDsl.g:3462:2: ()
            // InternalSiriusTextDsl.g:3463:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDefaultAccess().getDefaultAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getDefaultKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_2, grammarAccess.getDefaultAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalSiriusTextDsl.g:3476:1: ( (lv_body_3_0= ruleOperation ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==35||LA88_0==57||(LA88_0>=59 && LA88_0<=60)||LA88_0==63||LA88_0==65||LA88_0==68||LA88_0==71||LA88_0==74||(LA88_0>=76 && LA88_0<=77)||LA88_0==79) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3477:1: (lv_body_3_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:3477:1: (lv_body_3_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:3478:3: lv_body_3_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefaultAccess().getBodyOperationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_58);
            	    lv_body_3_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefaultRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_3_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleMapping"
    // InternalSiriusTextDsl.g:3506:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalSiriusTextDsl.g:3507:2: (iv_ruleMapping= ruleMapping EOF )
            // InternalSiriusTextDsl.g:3508:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalSiriusTextDsl.g:3515:1: ruleMapping returns [EObject current=null] : this_Container_0= ruleContainer ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3518:28: (this_Container_0= ruleContainer )
            // InternalSiriusTextDsl.g:3520:5: this_Container_0= ruleContainer
            {
             
                    newCompositeNode(grammarAccess.getMappingAccess().getContainerParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Container_0=ruleContainer();

            state._fsp--;

             
                    current = this_Container_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleContainer"
    // InternalSiriusTextDsl.g:3536:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSiriusTextDsl.g:3537:2: (iv_ruleContainer= ruleContainer EOF )
            // InternalSiriusTextDsl.g:3538:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSiriusTextDsl.g:3545:1: ruleContainer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        Token lv_domainClass_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_precondition_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_semanticCanditatesExpression_15_0=null;
        Token otherlv_17=null;
        EObject lv_conditionalStyles_16_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3548:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' ) )
            // InternalSiriusTextDsl.g:3549:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' )
            {
            // InternalSiriusTextDsl.g:3549:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' )
            // InternalSiriusTextDsl.g:3549:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}'
            {
            // InternalSiriusTextDsl.g:3549:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_DOCUMENTATION) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSiriusTextDsl.g:3550:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:3550:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:3551:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_77); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getContainerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3567:3: ( (lv_list_1_0= 'list' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==82) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSiriusTextDsl.g:3568:1: (lv_list_1_0= 'list' )
                    {
                    // InternalSiriusTextDsl.g:3568:1: (lv_list_1_0= 'list' )
                    // InternalSiriusTextDsl.g:3569:3: lv_list_1_0= 'list'
                    {
                    lv_list_1_0=(Token)match(input,82,FOLLOW_78); 

                            newLeafNode(lv_list_1_0, grammarAccess.getContainerAccess().getListListKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "list", true, "list");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,83,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getContainerKeyword_2());
                
            // InternalSiriusTextDsl.g:3586:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:3587:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:3587:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:3588:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            			newLeafNode(lv_name_3_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:3604:2: (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==16) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalSiriusTextDsl.g:3604:4: otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAsKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:3608:1: ( (lv_label_5_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:3609:1: (lv_label_5_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:3609:1: (lv_label_5_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:3610:3: lv_label_5_0= RULE_STRING
                    {
                    lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    			newLeafNode(lv_label_5_0, grammarAccess.getContainerAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_5_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_10); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getForKeyword_5());
                
            // InternalSiriusTextDsl.g:3630:1: ( (lv_domainClass_7_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3631:1: (lv_domainClass_7_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3631:1: (lv_domainClass_7_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3632:3: lv_domainClass_7_0= RULE_STRING
            {
            lv_domainClass_7_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

            			newLeafNode(lv_domainClass_7_0, grammarAccess.getContainerAccess().getDomainClassSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_7_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,84,FOLLOW_4); 

                	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getStyleKeyword_7());
                
            // InternalSiriusTextDsl.g:3652:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3653:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3653:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3654:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_32);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:3667:2: (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==36) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSiriusTextDsl.g:3667:4: otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_33); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:3671:1: ( (lv_precondition_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3672:1: (lv_precondition_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3672:1: (lv_precondition_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3673:3: lv_precondition_11_0= RULE_EXPRESSION
                    {
                    lv_precondition_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_precondition_11_0, grammarAccess.getContainerAccess().getPreconditionEXPRESSIONTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precondition",
                            		lv_precondition_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_80); 

                	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10());
                
            // InternalSiriusTextDsl.g:3693:1: (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==85) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSiriusTextDsl.g:3693:3: otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) )
                    {
                    otherlv_13=(Token)match(input,85,FOLLOW_15); 

                        	newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0());
                        
                    otherlv_14=(Token)match(input,21,FOLLOW_33); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:3701:1: ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3702:1: (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3702:1: (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3703:3: lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION
                    {
                    lv_semanticCanditatesExpression_15_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_81); 

                    			newLeafNode(lv_semanticCanditatesExpression_15_0, grammarAccess.getContainerAccess().getSemanticCanditatesExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"semanticCanditatesExpression",
                            		lv_semanticCanditatesExpression_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3719:4: ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==84) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3720:1: (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration )
            	    {
            	    // InternalSiriusTextDsl.g:3720:1: (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration )
            	    // InternalSiriusTextDsl.g:3721:3: lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_81);
            	    lv_conditionalStyles_16_0=ruleConditionalContainerStyleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditionalStyles",
            	            		lv_conditionalStyles_16_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.ConditionalContainerStyleDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_17, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:3749:1: entryRuleConditionalContainerStyleDeclaration returns [EObject current=null] : iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF ;
    public final EObject entryRuleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalContainerStyleDeclaration = null;


        try {
            // InternalSiriusTextDsl.g:3750:2: (iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF )
            // InternalSiriusTextDsl.g:3751:2: iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalContainerStyleDeclaration=ruleConditionalContainerStyleDeclaration();

            state._fsp--;

             current =iv_ruleConditionalContainerStyleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalContainerStyleDeclaration"


    // $ANTLR start "ruleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:3758:1: ruleConditionalContainerStyleDeclaration returns [EObject current=null] : (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) ;
    public final EObject ruleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_conditionalStyleExpression_3_0=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3761:28: ( (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) )
            // InternalSiriusTextDsl.g:3762:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            {
            // InternalSiriusTextDsl.g:3762:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            // InternalSiriusTextDsl.g:3762:3: otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:3766:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3767:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3767:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3768:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_82);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_33); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2());
                
            // InternalSiriusTextDsl.g:3785:1: ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:3786:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:3786:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:3787:3: lv_conditionalStyleExpression_3_0= RULE_EXPRESSION
            {
            lv_conditionalStyleExpression_3_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_2); 

            			newLeafNode(lv_conditionalStyleExpression_3_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionalStyleExpression",
                    		lv_conditionalStyleExpression_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalContainerStyleDeclaration"


    // $ANTLR start "entryRuleStyle"
    // InternalSiriusTextDsl.g:3811:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalSiriusTextDsl.g:3812:2: (iv_ruleStyle= ruleStyle EOF )
            // InternalSiriusTextDsl.g:3813:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalSiriusTextDsl.g:3820:1: ruleStyle returns [EObject current=null] : (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerStyle_0 = null;

        EObject this_EdgeStyle_1 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3823:28: ( (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle ) )
            // InternalSiriusTextDsl.g:3824:1: (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle )
            {
            // InternalSiriusTextDsl.g:3824:1: (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_DOCUMENTATION||LA95_0==86) ) {
                alt95=1;
            }
            else if ( (LA95_0==99) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalSiriusTextDsl.g:3825:5: this_ContainerStyle_0= ruleContainerStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleAccess().getContainerStyleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ContainerStyle_0=ruleContainerStyle();

                    state._fsp--;

                     
                            current = this_ContainerStyle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:3835:5: this_EdgeStyle_1= ruleEdgeStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleAccess().getEdgeStyleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_EdgeStyle_1=ruleEdgeStyle();

                    state._fsp--;

                     
                            current = this_EdgeStyle_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleContainerStyle"
    // InternalSiriusTextDsl.g:3851:1: entryRuleContainerStyle returns [EObject current=null] : iv_ruleContainerStyle= ruleContainerStyle EOF ;
    public final EObject entryRuleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerStyle = null;


        try {
            // InternalSiriusTextDsl.g:3852:2: (iv_ruleContainerStyle= ruleContainerStyle EOF )
            // InternalSiriusTextDsl.g:3853:2: iv_ruleContainerStyle= ruleContainerStyle EOF
            {
             newCompositeNode(grammarAccess.getContainerStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerStyle=ruleContainerStyle();

            state._fsp--;

             current =iv_ruleContainerStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerStyle"


    // $ANTLR start "ruleContainerStyle"
    // InternalSiriusTextDsl.g:3860:1: ruleContainerStyle returns [EObject current=null] : this_Gradient_0= ruleGradient ;
    public final EObject ruleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject this_Gradient_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3863:28: (this_Gradient_0= ruleGradient )
            // InternalSiriusTextDsl.g:3865:5: this_Gradient_0= ruleGradient
            {
             
                    newCompositeNode(grammarAccess.getContainerStyleAccess().getGradientParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Gradient_0=ruleGradient();

            state._fsp--;

             
                    current = this_Gradient_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerStyle"


    // $ANTLR start "entryRuleGradient"
    // InternalSiriusTextDsl.g:3881:1: entryRuleGradient returns [EObject current=null] : iv_ruleGradient= ruleGradient EOF ;
    public final EObject entryRuleGradient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradient = null;


        try {
            // InternalSiriusTextDsl.g:3882:2: (iv_ruleGradient= ruleGradient EOF )
            // InternalSiriusTextDsl.g:3883:2: iv_ruleGradient= ruleGradient EOF
            {
             newCompositeNode(grammarAccess.getGradientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGradient=ruleGradient();

            state._fsp--;

             current =iv_ruleGradient; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradient"


    // $ANTLR start "ruleGradient"
    // InternalSiriusTextDsl.g:3890:1: ruleGradient returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' ) ;
    public final EObject ruleGradient() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_labelExpression_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_borderSize_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_icon_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_heightComputationExpression_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_widthComputationExpression_28_0=null;
        Token otherlv_29=null;
        Enumerator lv_direction_2_0 = null;

        Enumerator lv_labelAlignment_10_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3893:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' ) )
            // InternalSiriusTextDsl.g:3894:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' )
            {
            // InternalSiriusTextDsl.g:3894:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' )
            // InternalSiriusTextDsl.g:3894:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}'
            {
            // InternalSiriusTextDsl.g:3894:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_DOCUMENTATION) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalSiriusTextDsl.g:3895:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:3895:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:3896:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_83); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getGradientAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,86,FOLLOW_84); 

                	newLeafNode(otherlv_1, grammarAccess.getGradientAccess().getGradientKeyword_1());
                
            // InternalSiriusTextDsl.g:3916:1: ( (lv_direction_2_0= ruleGradientDirection ) )
            // InternalSiriusTextDsl.g:3917:1: (lv_direction_2_0= ruleGradientDirection )
            {
            // InternalSiriusTextDsl.g:3917:1: (lv_direction_2_0= ruleGradientDirection )
            // InternalSiriusTextDsl.g:3918:3: lv_direction_2_0= ruleGradientDirection
            {
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getDirectionGradientDirectionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_direction_2_0=ruleGradientDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradientRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.GradientDirection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:3934:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:3935:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:3935:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:3936:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_85); 

            			newLeafNode(lv_name_3_0, grammarAccess.getGradientAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,87,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getGradientAccess().getFromKeyword_4());
                
            // InternalSiriusTextDsl.g:3956:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3957:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3957:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3958:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_86);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,88,FOLLOW_4); 

                	newLeafNode(otherlv_6, grammarAccess.getGradientAccess().getToKeyword_6());
                
            // InternalSiriusTextDsl.g:3975:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3976:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3976:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3977:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_87); 

                	newLeafNode(otherlv_8, grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalSiriusTextDsl.g:3994:1: (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==89) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalSiriusTextDsl.g:3994:3: otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,89,FOLLOW_88); 

                        	newLeafNode(otherlv_9, grammarAccess.getGradientAccess().getLabelKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:3998:1: ( (lv_labelAlignment_10_0= ruleLabelAlignment ) )
                    // InternalSiriusTextDsl.g:3999:1: (lv_labelAlignment_10_0= ruleLabelAlignment )
                    {
                    // InternalSiriusTextDsl.g:3999:1: (lv_labelAlignment_10_0= ruleLabelAlignment )
                    // InternalSiriusTextDsl.g:4000:3: lv_labelAlignment_10_0= ruleLabelAlignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelAlignmentLabelAlignmentEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_33);
                    lv_labelAlignment_10_0=ruleLabelAlignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGradientRule());
                    	        }
                           		set(
                           			current, 
                           			"labelAlignment",
                            		lv_labelAlignment_10_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.LabelAlignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:4016:2: ( (lv_labelExpression_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4017:1: (lv_labelExpression_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4017:1: (lv_labelExpression_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4018:3: lv_labelExpression_11_0= RULE_EXPRESSION
                    {
                    lv_labelExpression_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_89); 

                    			newLeafNode(lv_labelExpression_11_0, grammarAccess.getGradientAccess().getLabelExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"labelExpression",
                            		lv_labelExpression_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,90,FOLLOW_4); 

                        	newLeafNode(otherlv_12, grammarAccess.getGradientAccess().getInKeyword_9_3());
                        
                    // InternalSiriusTextDsl.g:4038:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:4039:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:4039:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:4040:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 
                    	    
                    pushFollow(FOLLOW_90);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4053:4: (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==91) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSiriusTextDsl.g:4053:6: otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,91,FOLLOW_91); 

                        	newLeafNode(otherlv_14, grammarAccess.getGradientAccess().getBorderKeyword_10_0());
                        
                    otherlv_15=(Token)match(input,92,FOLLOW_15); 

                        	newLeafNode(otherlv_15, grammarAccess.getGradientAccess().getSizeKeyword_10_1());
                        
                    otherlv_16=(Token)match(input,21,FOLLOW_92); 

                        	newLeafNode(otherlv_16, grammarAccess.getGradientAccess().getEqualsSignKeyword_10_2());
                        
                    // InternalSiriusTextDsl.g:4065:1: ( (lv_borderSize_17_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:4066:1: (lv_borderSize_17_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:4066:1: (lv_borderSize_17_0= RULE_INT )
                    // InternalSiriusTextDsl.g:4067:3: lv_borderSize_17_0= RULE_INT
                    {
                    lv_borderSize_17_0=(Token)match(input,RULE_INT,FOLLOW_89); 

                    			newLeafNode(lv_borderSize_17_0, grammarAccess.getGradientAccess().getBorderSizeINTTerminalRuleCall_10_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"borderSize",
                            		lv_borderSize_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,90,FOLLOW_4); 

                        	newLeafNode(otherlv_18, grammarAccess.getGradientAccess().getInKeyword_10_4());
                        
                    // InternalSiriusTextDsl.g:4087:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:4088:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:4088:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:4089:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 
                    	    
                    pushFollow(FOLLOW_93);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4102:4: (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==25) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalSiriusTextDsl.g:4102:6: otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_20, grammarAccess.getGradientAccess().getIconKeyword_11_0());
                        
                    otherlv_21=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_21, grammarAccess.getGradientAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:4110:1: ( (lv_icon_22_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:4111:1: (lv_icon_22_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:4111:1: (lv_icon_22_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:4112:3: lv_icon_22_0= RULE_STRING
                    {
                    lv_icon_22_0=(Token)match(input,RULE_STRING,FOLLOW_94); 

                    			newLeafNode(lv_icon_22_0, grammarAccess.getGradientAccess().getIconSTRINGTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_22_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4128:4: (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==93) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalSiriusTextDsl.g:4128:6: otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) )
                    {
                    otherlv_23=(Token)match(input,93,FOLLOW_15); 

                        	newLeafNode(otherlv_23, grammarAccess.getGradientAccess().getHeightComputationExpressionKeyword_12_0());
                        
                    otherlv_24=(Token)match(input,21,FOLLOW_33); 

                        	newLeafNode(otherlv_24, grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:4136:1: ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4137:1: (lv_heightComputationExpression_25_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4137:1: (lv_heightComputationExpression_25_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4138:3: lv_heightComputationExpression_25_0= RULE_EXPRESSION
                    {
                    lv_heightComputationExpression_25_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_95); 

                    			newLeafNode(lv_heightComputationExpression_25_0, grammarAccess.getGradientAccess().getHeightComputationExpressionEXPRESSIONTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"heightComputationExpression",
                            		lv_heightComputationExpression_25_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4154:4: (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==94) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSiriusTextDsl.g:4154:6: otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) )
                    {
                    otherlv_26=(Token)match(input,94,FOLLOW_15); 

                        	newLeafNode(otherlv_26, grammarAccess.getGradientAccess().getWidthComputationExpressionKeyword_13_0());
                        
                    otherlv_27=(Token)match(input,21,FOLLOW_33); 

                        	newLeafNode(otherlv_27, grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1());
                        
                    // InternalSiriusTextDsl.g:4162:1: ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4163:1: (lv_widthComputationExpression_28_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4163:1: (lv_widthComputationExpression_28_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4164:3: lv_widthComputationExpression_28_0= RULE_EXPRESSION
                    {
                    lv_widthComputationExpression_28_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_22); 

                    			newLeafNode(lv_widthComputationExpression_28_0, grammarAccess.getGradientAccess().getWidthComputationExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"widthComputationExpression",
                            		lv_widthComputationExpression_28_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_29, grammarAccess.getGradientAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradient"


    // $ANTLR start "entryRuleEdge"
    // InternalSiriusTextDsl.g:4192:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalSiriusTextDsl.g:4193:2: (iv_ruleEdge= ruleEdge EOF )
            // InternalSiriusTextDsl.g:4194:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalSiriusTextDsl.g:4201:1: ruleEdge returns [EObject current=null] : this_RelationBasedEdge_0= ruleRelationBasedEdge ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        EObject this_RelationBasedEdge_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4204:28: (this_RelationBasedEdge_0= ruleRelationBasedEdge )
            // InternalSiriusTextDsl.g:4206:5: this_RelationBasedEdge_0= ruleRelationBasedEdge
            {
             
                    newCompositeNode(grammarAccess.getEdgeAccess().getRelationBasedEdgeParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_RelationBasedEdge_0=ruleRelationBasedEdge();

            state._fsp--;

             
                    current = this_RelationBasedEdge_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleRelationBasedEdge"
    // InternalSiriusTextDsl.g:4222:1: entryRuleRelationBasedEdge returns [EObject current=null] : iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF ;
    public final EObject entryRuleRelationBasedEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationBasedEdge = null;


        try {
            // InternalSiriusTextDsl.g:4223:2: (iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF )
            // InternalSiriusTextDsl.g:4224:2: iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF
            {
             newCompositeNode(grammarAccess.getRelationBasedEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationBasedEdge=ruleRelationBasedEdge();

            state._fsp--;

             current =iv_ruleRelationBasedEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationBasedEdge"


    // $ANTLR start "ruleRelationBasedEdge"
    // InternalSiriusTextDsl.g:4231:1: ruleRelationBasedEdge returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' ) ;
    public final EObject ruleRelationBasedEdge() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_targetFinderExpression_24_0=null;
        Token otherlv_25=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4234:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' ) )
            // InternalSiriusTextDsl.g:4235:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' )
            {
            // InternalSiriusTextDsl.g:4235:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' )
            // InternalSiriusTextDsl.g:4235:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}'
            {
            // InternalSiriusTextDsl.g:4235:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_DOCUMENTATION) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalSiriusTextDsl.g:4236:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:4236:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:4237:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_96); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getRelationBasedEdgeAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,95,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationBasedEdgeAccess().getRelationBasedEdgeKeyword_1());
                
            // InternalSiriusTextDsl.g:4257:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4258:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4258:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:4259:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRelationBasedEdgeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:4275:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==16) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalSiriusTextDsl.g:4275:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getRelationBasedEdgeAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:4279:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:4280:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:4280:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:4281:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getRelationBasedEdgeAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,84,FOLLOW_4); 

                	newLeafNode(otherlv_5, grammarAccess.getRelationBasedEdgeAccess().getStyleKeyword_4());
                
            // InternalSiriusTextDsl.g:4301:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4302:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4302:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4303:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getStyleEdgeStyleCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_98); 

                	newLeafNode(otherlv_7, grammarAccess.getRelationBasedEdgeAccess().getLeftCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,96,FOLLOW_15); 

                	newLeafNode(otherlv_8, grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsKeyword_7());
                
            otherlv_9=(Token)match(input,21,FOLLOW_16); 

                	newLeafNode(otherlv_9, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_8());
                
            otherlv_10=(Token)match(input,22,FOLLOW_20); 

                	newLeafNode(otherlv_10, grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_9());
                
            // InternalSiriusTextDsl.g:4332:1: ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ID) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSiriusTextDsl.g:4332:2: ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:4332:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:4333:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:4333:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:4334:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_10_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:4347:2: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==23) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:4347:4: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,23,FOLLOW_4); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_10_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:4351:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:4352:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:4352:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:4353:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_10_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,24,FOLLOW_99); 

                	newLeafNode(otherlv_14, grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_11());
                
            otherlv_15=(Token)match(input,97,FOLLOW_15); 

                	newLeafNode(otherlv_15, grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsKeyword_12());
                
            otherlv_16=(Token)match(input,21,FOLLOW_16); 

                	newLeafNode(otherlv_16, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_13());
                
            otherlv_17=(Token)match(input,22,FOLLOW_20); 

                	newLeafNode(otherlv_17, grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_14());
                
            // InternalSiriusTextDsl.g:4382:1: ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_ID) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalSiriusTextDsl.g:4382:2: ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:4382:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:4383:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:4383:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:4384:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_15_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:4397:2: (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==23) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:4397:4: otherlv_19= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_19=(Token)match(input,23,FOLLOW_4); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_15_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:4401:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:4402:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:4402:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:4403:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_15_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,24,FOLLOW_100); 

                	newLeafNode(otherlv_21, grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_16());
                
            otherlv_22=(Token)match(input,98,FOLLOW_15); 

                	newLeafNode(otherlv_22, grammarAccess.getRelationBasedEdgeAccess().getTargetFileExpressionKeyword_17());
                
            otherlv_23=(Token)match(input,21,FOLLOW_33); 

                	newLeafNode(otherlv_23, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_18());
                
            // InternalSiriusTextDsl.g:4428:1: ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:4429:1: (lv_targetFinderExpression_24_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:4429:1: (lv_targetFinderExpression_24_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:4430:3: lv_targetFinderExpression_24_0= RULE_EXPRESSION
            {
            lv_targetFinderExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_22); 

            			newLeafNode(lv_targetFinderExpression_24_0, grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionEXPRESSIONTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetFinderExpression",
                    		lv_targetFinderExpression_24_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_25=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_25, grammarAccess.getRelationBasedEdgeAccess().getRightCurlyBracketKeyword_20());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationBasedEdge"


    // $ANTLR start "entryRuleEdgeStyle"
    // InternalSiriusTextDsl.g:4458:1: entryRuleEdgeStyle returns [EObject current=null] : iv_ruleEdgeStyle= ruleEdgeStyle EOF ;
    public final EObject entryRuleEdgeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeStyle = null;


        try {
            // InternalSiriusTextDsl.g:4459:2: (iv_ruleEdgeStyle= ruleEdgeStyle EOF )
            // InternalSiriusTextDsl.g:4460:2: iv_ruleEdgeStyle= ruleEdgeStyle EOF
            {
             newCompositeNode(grammarAccess.getEdgeStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdgeStyle=ruleEdgeStyle();

            state._fsp--;

             current =iv_ruleEdgeStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeStyle"


    // $ANTLR start "ruleEdgeStyle"
    // InternalSiriusTextDsl.g:4467:1: ruleEdgeStyle returns [EObject current=null] : (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleEdgeStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_sizeComputationExpression_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Enumerator lv_lineStyle_6_0 = null;

        Enumerator lv_routingStyle_9_0 = null;

        Enumerator lv_sourceArrow_13_0 = null;

        Enumerator lv_targetArrow_16_0 = null;

        Enumerator lv_foldingStyle_22_0 = null;

        Enumerator lv_endsCentering_25_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4470:28: ( (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' ) )
            // InternalSiriusTextDsl.g:4471:1: (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' )
            {
            // InternalSiriusTextDsl.g:4471:1: (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' )
            // InternalSiriusTextDsl.g:4471:3: otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getEdgeStyleAccess().getEdgeStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:4475:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4476:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4476:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:4477:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_89); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEdgeStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,90,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getEdgeStyleAccess().getInKeyword_2());
                
            // InternalSiriusTextDsl.g:4497:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4498:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4498:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4499:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeStyleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getStrokeColorColorCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_101);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:4512:2: (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==100) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalSiriusTextDsl.g:4512:4: otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) )
                    {
                    otherlv_4=(Token)match(input,100,FOLLOW_15); 

                        	newLeafNode(otherlv_4, grammarAccess.getEdgeStyleAccess().getLineKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,21,FOLLOW_102); 

                        	newLeafNode(otherlv_5, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:4520:1: ( (lv_lineStyle_6_0= ruleLineStyle ) )
                    // InternalSiriusTextDsl.g:4521:1: (lv_lineStyle_6_0= ruleLineStyle )
                    {
                    // InternalSiriusTextDsl.g:4521:1: (lv_lineStyle_6_0= ruleLineStyle )
                    // InternalSiriusTextDsl.g:4522:3: lv_lineStyle_6_0= ruleLineStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_103);
                    lv_lineStyle_6_0=ruleLineStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"lineStyle",
                            		lv_lineStyle_6_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.LineStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4538:4: (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==101) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalSiriusTextDsl.g:4538:6: otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) )
                    {
                    otherlv_7=(Token)match(input,101,FOLLOW_15); 

                        	newLeafNode(otherlv_7, grammarAccess.getEdgeStyleAccess().getRoutingKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_104); 

                        	newLeafNode(otherlv_8, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_5_1());
                        
                    // InternalSiriusTextDsl.g:4546:1: ( (lv_routingStyle_9_0= ruleRoutingStyle ) )
                    // InternalSiriusTextDsl.g:4547:1: (lv_routingStyle_9_0= ruleRoutingStyle )
                    {
                    // InternalSiriusTextDsl.g:4547:1: (lv_routingStyle_9_0= ruleRoutingStyle )
                    // InternalSiriusTextDsl.g:4548:3: lv_routingStyle_9_0= ruleRoutingStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getRoutingStyleRoutingStyleEnumRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_11);
                    lv_routingStyle_9_0=ruleRoutingStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"routingStyle",
                            		lv_routingStyle_9_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.RoutingStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_105); 

                	newLeafNode(otherlv_10, grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalSiriusTextDsl.g:4568:1: (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==102) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalSiriusTextDsl.g:4568:3: otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) )
                    {
                    otherlv_11=(Token)match(input,102,FOLLOW_15); 

                        	newLeafNode(otherlv_11, grammarAccess.getEdgeStyleAccess().getSourceArrowKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,21,FOLLOW_106); 

                        	newLeafNode(otherlv_12, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_7_1());
                        
                    // InternalSiriusTextDsl.g:4576:1: ( (lv_sourceArrow_13_0= ruleArrowDecorator ) )
                    // InternalSiriusTextDsl.g:4577:1: (lv_sourceArrow_13_0= ruleArrowDecorator )
                    {
                    // InternalSiriusTextDsl.g:4577:1: (lv_sourceArrow_13_0= ruleArrowDecorator )
                    // InternalSiriusTextDsl.g:4578:3: lv_sourceArrow_13_0= ruleArrowDecorator
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getSourceArrowArrowDecoratorEnumRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_107);
                    lv_sourceArrow_13_0=ruleArrowDecorator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceArrow",
                            		lv_sourceArrow_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.ArrowDecorator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4594:4: (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==103) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalSiriusTextDsl.g:4594:6: otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) )
                    {
                    otherlv_14=(Token)match(input,103,FOLLOW_15); 

                        	newLeafNode(otherlv_14, grammarAccess.getEdgeStyleAccess().getTargetArrowKeyword_8_0());
                        
                    otherlv_15=(Token)match(input,21,FOLLOW_106); 

                        	newLeafNode(otherlv_15, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_8_1());
                        
                    // InternalSiriusTextDsl.g:4602:1: ( (lv_targetArrow_16_0= ruleArrowDecorator ) )
                    // InternalSiriusTextDsl.g:4603:1: (lv_targetArrow_16_0= ruleArrowDecorator )
                    {
                    // InternalSiriusTextDsl.g:4603:1: (lv_targetArrow_16_0= ruleArrowDecorator )
                    // InternalSiriusTextDsl.g:4604:3: lv_targetArrow_16_0= ruleArrowDecorator
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getTargetArrowArrowDecoratorEnumRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_108);
                    lv_targetArrow_16_0=ruleArrowDecorator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"targetArrow",
                            		lv_targetArrow_16_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.ArrowDecorator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4620:4: (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==104) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalSiriusTextDsl.g:4620:6: otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) )
                    {
                    otherlv_17=(Token)match(input,104,FOLLOW_15); 

                        	newLeafNode(otherlv_17, grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,21,FOLLOW_33); 

                        	newLeafNode(otherlv_18, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_9_1());
                        
                    // InternalSiriusTextDsl.g:4628:1: ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4629:1: (lv_sizeComputationExpression_19_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4629:1: (lv_sizeComputationExpression_19_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4630:3: lv_sizeComputationExpression_19_0= RULE_EXPRESSION
                    {
                    lv_sizeComputationExpression_19_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_109); 

                    			newLeafNode(lv_sizeComputationExpression_19_0, grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEdgeStyleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sizeComputationExpression",
                            		lv_sizeComputationExpression_19_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4646:4: (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==105) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalSiriusTextDsl.g:4646:6: otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) )
                    {
                    otherlv_20=(Token)match(input,105,FOLLOW_15); 

                        	newLeafNode(otherlv_20, grammarAccess.getEdgeStyleAccess().getFoldingStyleKeyword_10_0());
                        
                    otherlv_21=(Token)match(input,21,FOLLOW_110); 

                        	newLeafNode(otherlv_21, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_10_1());
                        
                    // InternalSiriusTextDsl.g:4654:1: ( (lv_foldingStyle_22_0= ruleFoldingStyle ) )
                    // InternalSiriusTextDsl.g:4655:1: (lv_foldingStyle_22_0= ruleFoldingStyle )
                    {
                    // InternalSiriusTextDsl.g:4655:1: (lv_foldingStyle_22_0= ruleFoldingStyle )
                    // InternalSiriusTextDsl.g:4656:3: lv_foldingStyle_22_0= ruleFoldingStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getFoldingStyleFoldingStyleEnumRuleCall_10_2_0()); 
                    	    
                    pushFollow(FOLLOW_111);
                    lv_foldingStyle_22_0=ruleFoldingStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"foldingStyle",
                            		lv_foldingStyle_22_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.FoldingStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4672:4: (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==106) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalSiriusTextDsl.g:4672:6: otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) )
                    {
                    otherlv_23=(Token)match(input,106,FOLLOW_15); 

                        	newLeafNode(otherlv_23, grammarAccess.getEdgeStyleAccess().getEndsCenteringKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,21,FOLLOW_112); 

                        	newLeafNode(otherlv_24, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:4680:1: ( (lv_endsCentering_25_0= ruleEndsCentering ) )
                    // InternalSiriusTextDsl.g:4681:1: (lv_endsCentering_25_0= ruleEndsCentering )
                    {
                    // InternalSiriusTextDsl.g:4681:1: (lv_endsCentering_25_0= ruleEndsCentering )
                    // InternalSiriusTextDsl.g:4682:3: lv_endsCentering_25_0= ruleEndsCentering
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getEndsCenteringEndsCenteringEnumRuleCall_11_2_0()); 
                    	    
                    pushFollow(FOLLOW_22);
                    lv_endsCentering_25_0=ruleEndsCentering();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"endsCentering",
                            		lv_endsCentering_25_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EndsCentering");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_26, grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeStyle"


    // $ANTLR start "entryRulePalette"
    // InternalSiriusTextDsl.g:4710:1: entryRulePalette returns [EObject current=null] : iv_rulePalette= rulePalette EOF ;
    public final EObject entryRulePalette() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePalette = null;


        try {
            // InternalSiriusTextDsl.g:4711:2: (iv_rulePalette= rulePalette EOF )
            // InternalSiriusTextDsl.g:4712:2: iv_rulePalette= rulePalette EOF
            {
             newCompositeNode(grammarAccess.getPaletteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePalette=rulePalette();

            state._fsp--;

             current =iv_rulePalette; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePalette"


    // $ANTLR start "rulePalette"
    // InternalSiriusTextDsl.g:4719:1: rulePalette returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) ;
    public final EObject rulePalette() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_colors_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4722:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) )
            // InternalSiriusTextDsl.g:4723:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            {
            // InternalSiriusTextDsl.g:4723:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            // InternalSiriusTextDsl.g:4723:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}'
            {
            // InternalSiriusTextDsl.g:4723:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_DOCUMENTATION) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalSiriusTextDsl.g:4724:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:4724:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:4725:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_113); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getPaletteAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPaletteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,107,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getPaletteAccess().getPaletteKeyword_1());
                
            // InternalSiriusTextDsl.g:4745:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4746:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4746:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:4747:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPaletteAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPaletteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_114); 

                	newLeafNode(otherlv_3, grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:4767:1: ( (lv_colors_4_0= ruleColor ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==108) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:4768:1: (lv_colors_4_0= ruleColor )
            	    {
            	    // InternalSiriusTextDsl.g:4768:1: (lv_colors_4_0= ruleColor )
            	    // InternalSiriusTextDsl.g:4769:3: lv_colors_4_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_114);
            	    lv_colors_4_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPaletteRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_4_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getPaletteAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePalette"


    // $ANTLR start "entryRuleColor"
    // InternalSiriusTextDsl.g:4797:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalSiriusTextDsl.g:4798:2: (iv_ruleColor= ruleColor EOF )
            // InternalSiriusTextDsl.g:4799:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSiriusTextDsl.g:4806:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4809:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) )
            // InternalSiriusTextDsl.g:4810:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            {
            // InternalSiriusTextDsl.g:4810:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            // InternalSiriusTextDsl.g:4810:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
                
            // InternalSiriusTextDsl.g:4814:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4815:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4815:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:4816:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_115); 

                	newLeafNode(otherlv_2, grammarAccess.getColorAccess().getEqualsSignKeyword_2());
                
            // InternalSiriusTextDsl.g:4836:1: ( (lv_value_3_0= ruleColorValue ) )
            // InternalSiriusTextDsl.g:4837:1: (lv_value_3_0= ruleColorValue )
            {
            // InternalSiriusTextDsl.g:4837:1: (lv_value_3_0= ruleColorValue )
            // InternalSiriusTextDsl.g:4838:3: lv_value_3_0= ruleColorValue
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleColorValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ColorValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleColorValue"
    // InternalSiriusTextDsl.g:4862:1: entryRuleColorValue returns [EObject current=null] : iv_ruleColorValue= ruleColorValue EOF ;
    public final EObject entryRuleColorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValue = null;


        try {
            // InternalSiriusTextDsl.g:4863:2: (iv_ruleColorValue= ruleColorValue EOF )
            // InternalSiriusTextDsl.g:4864:2: iv_ruleColorValue= ruleColorValue EOF
            {
             newCompositeNode(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorValue=ruleColorValue();

            state._fsp--;

             current =iv_ruleColorValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalSiriusTextDsl.g:4871:1: ruleColorValue returns [EObject current=null] : this_RGB_0= ruleRGB ;
    public final EObject ruleColorValue() throws RecognitionException {
        EObject current = null;

        EObject this_RGB_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4874:28: (this_RGB_0= ruleRGB )
            // InternalSiriusTextDsl.g:4876:5: this_RGB_0= ruleRGB
            {
             
                    newCompositeNode(grammarAccess.getColorValueAccess().getRGBParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_RGB_0=ruleRGB();

            state._fsp--;

             
                    current = this_RGB_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "entryRuleRGB"
    // InternalSiriusTextDsl.g:4892:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // InternalSiriusTextDsl.g:4893:2: (iv_ruleRGB= ruleRGB EOF )
            // InternalSiriusTextDsl.g:4894:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // InternalSiriusTextDsl.g:4901:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_red_2_0=null;
        Token otherlv_3=null;
        Token lv_green_4_0=null;
        Token otherlv_5=null;
        Token lv_blue_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4904:28: ( (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSiriusTextDsl.g:4905:1: (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSiriusTextDsl.g:4905:1: (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSiriusTextDsl.g:4905:3: otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_49); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRgbKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_92); 

                	newLeafNode(otherlv_1, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:4913:1: ( (lv_red_2_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:4914:1: (lv_red_2_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:4914:1: (lv_red_2_0= RULE_INT )
            // InternalSiriusTextDsl.g:4915:3: lv_red_2_0= RULE_INT
            {
            lv_red_2_0=(Token)match(input,RULE_INT,FOLLOW_62); 

            			newLeafNode(lv_red_2_0, grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"red",
                    		lv_red_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_92); 

                	newLeafNode(otherlv_3, grammarAccess.getRGBAccess().getCommaKeyword_3());
                
            // InternalSiriusTextDsl.g:4935:1: ( (lv_green_4_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:4936:1: (lv_green_4_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:4936:1: (lv_green_4_0= RULE_INT )
            // InternalSiriusTextDsl.g:4937:3: lv_green_4_0= RULE_INT
            {
            lv_green_4_0=(Token)match(input,RULE_INT,FOLLOW_62); 

            			newLeafNode(lv_green_4_0, grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"green",
                    		lv_green_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_92); 

                	newLeafNode(otherlv_5, grammarAccess.getRGBAccess().getCommaKeyword_5());
                
            // InternalSiriusTextDsl.g:4957:1: ( (lv_blue_6_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:4958:1: (lv_blue_6_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:4958:1: (lv_blue_6_0= RULE_INT )
            // InternalSiriusTextDsl.g:4959:3: lv_blue_6_0= RULE_INT
            {
            lv_blue_6_0=(Token)match(input,RULE_INT,FOLLOW_50); 

            			newLeafNode(lv_blue_6_0, grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"blue",
                    		lv_blue_6_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,51,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getRGBAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRGB"


    // $ANTLR start "ruleLabelAlignment"
    // InternalSiriusTextDsl.g:4987:1: ruleLabelAlignment returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleLabelAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:4989:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalSiriusTextDsl.g:4990:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalSiriusTextDsl.g:4990:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt117=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt117=1;
                }
                break;
            case 111:
                {
                alt117=2;
                }
                break;
            case 112:
                {
                alt117=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalSiriusTextDsl.g:4990:2: (enumLiteral_0= 'left' )
                    {
                    // InternalSiriusTextDsl.g:4990:2: (enumLiteral_0= 'left' )
                    // InternalSiriusTextDsl.g:4990:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:4996:6: (enumLiteral_1= 'center' )
                    {
                    // InternalSiriusTextDsl.g:4996:6: (enumLiteral_1= 'center' )
                    // InternalSiriusTextDsl.g:4996:8: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5002:6: (enumLiteral_2= 'right' )
                    {
                    // InternalSiriusTextDsl.g:5002:6: (enumLiteral_2= 'right' )
                    // InternalSiriusTextDsl.g:5002:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelAlignment"


    // $ANTLR start "ruleGradientDirection"
    // InternalSiriusTextDsl.g:5012:1: ruleGradientDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) ;
    public final Enumerator ruleGradientDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5014:28: ( ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) )
            // InternalSiriusTextDsl.g:5015:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            {
            // InternalSiriusTextDsl.g:5015:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            int alt118=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt118=1;
                }
                break;
            case 114:
                {
                alt118=2;
                }
                break;
            case 115:
                {
                alt118=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // InternalSiriusTextDsl.g:5015:2: (enumLiteral_0= 'oblique' )
                    {
                    // InternalSiriusTextDsl.g:5015:2: (enumLiteral_0= 'oblique' )
                    // InternalSiriusTextDsl.g:5015:4: enumLiteral_0= 'oblique'
                    {
                    enumLiteral_0=(Token)match(input,113,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5021:6: (enumLiteral_1= 'lefttoright' )
                    {
                    // InternalSiriusTextDsl.g:5021:6: (enumLiteral_1= 'lefttoright' )
                    // InternalSiriusTextDsl.g:5021:8: enumLiteral_1= 'lefttoright'
                    {
                    enumLiteral_1=(Token)match(input,114,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5027:6: (enumLiteral_2= 'toptobottom' )
                    {
                    // InternalSiriusTextDsl.g:5027:6: (enumLiteral_2= 'toptobottom' )
                    // InternalSiriusTextDsl.g:5027:8: enumLiteral_2= 'toptobottom'
                    {
                    enumLiteral_2=(Token)match(input,115,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradientDirection"


    // $ANTLR start "ruleLineStyle"
    // InternalSiriusTextDsl.g:5037:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5039:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) )
            // InternalSiriusTextDsl.g:5040:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            {
            // InternalSiriusTextDsl.g:5040:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            int alt119=4;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt119=1;
                }
                break;
            case 117:
                {
                alt119=2;
                }
                break;
            case 118:
                {
                alt119=3;
                }
                break;
            case 119:
                {
                alt119=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // InternalSiriusTextDsl.g:5040:2: (enumLiteral_0= 'solid' )
                    {
                    // InternalSiriusTextDsl.g:5040:2: (enumLiteral_0= 'solid' )
                    // InternalSiriusTextDsl.g:5040:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5046:6: (enumLiteral_1= 'dash' )
                    {
                    // InternalSiriusTextDsl.g:5046:6: (enumLiteral_1= 'dash' )
                    // InternalSiriusTextDsl.g:5046:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5052:6: (enumLiteral_2= 'dot' )
                    {
                    // InternalSiriusTextDsl.g:5052:6: (enumLiteral_2= 'dot' )
                    // InternalSiriusTextDsl.g:5052:8: enumLiteral_2= 'dot'
                    {
                    enumLiteral_2=(Token)match(input,118,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:5058:6: (enumLiteral_3= 'dash_dot' )
                    {
                    // InternalSiriusTextDsl.g:5058:6: (enumLiteral_3= 'dash_dot' )
                    // InternalSiriusTextDsl.g:5058:8: enumLiteral_3= 'dash_dot'
                    {
                    enumLiteral_3=(Token)match(input,119,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "ruleRoutingStyle"
    // InternalSiriusTextDsl.g:5068:1: ruleRoutingStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) ) ;
    public final Enumerator ruleRoutingStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5070:28: ( ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) ) )
            // InternalSiriusTextDsl.g:5071:1: ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) )
            {
            // InternalSiriusTextDsl.g:5071:1: ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) )
            int alt120=3;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt120=1;
                }
                break;
            case 121:
                {
                alt120=2;
                }
                break;
            case 122:
                {
                alt120=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // InternalSiriusTextDsl.g:5071:2: (enumLiteral_0= 'straight' )
                    {
                    // InternalSiriusTextDsl.g:5071:2: (enumLiteral_0= 'straight' )
                    // InternalSiriusTextDsl.g:5071:4: enumLiteral_0= 'straight'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5077:6: (enumLiteral_1= 'manhattan' )
                    {
                    // InternalSiriusTextDsl.g:5077:6: (enumLiteral_1= 'manhattan' )
                    // InternalSiriusTextDsl.g:5077:8: enumLiteral_1= 'manhattan'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5083:6: (enumLiteral_2= 'tree' )
                    {
                    // InternalSiriusTextDsl.g:5083:6: (enumLiteral_2= 'tree' )
                    // InternalSiriusTextDsl.g:5083:8: enumLiteral_2= 'tree'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getTreeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRoutingStyleAccess().getTreeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoutingStyle"


    // $ANTLR start "ruleArrowDecorator"
    // InternalSiriusTextDsl.g:5093:1: ruleArrowDecorator returns [Enumerator current=null] : ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) ) ;
    public final Enumerator ruleArrowDecorator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5095:28: ( ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) ) )
            // InternalSiriusTextDsl.g:5096:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) )
            {
            // InternalSiriusTextDsl.g:5096:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) )
            int alt121=11;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt121=1;
                }
                break;
            case 124:
                {
                alt121=2;
                }
                break;
            case 125:
                {
                alt121=3;
                }
                break;
            case 126:
                {
                alt121=4;
                }
                break;
            case 127:
                {
                alt121=5;
                }
                break;
            case 128:
                {
                alt121=6;
                }
                break;
            case 129:
                {
                alt121=7;
                }
                break;
            case 130:
                {
                alt121=8;
                }
                break;
            case 131:
                {
                alt121=9;
                }
                break;
            case 132:
                {
                alt121=10;
                }
                break;
            case 133:
                {
                alt121=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // InternalSiriusTextDsl.g:5096:2: (enumLiteral_0= 'NoDecoration' )
                    {
                    // InternalSiriusTextDsl.g:5096:2: (enumLiteral_0= 'NoDecoration' )
                    // InternalSiriusTextDsl.g:5096:4: enumLiteral_0= 'NoDecoration'
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5102:6: (enumLiteral_1= 'OutputArrow' )
                    {
                    // InternalSiriusTextDsl.g:5102:6: (enumLiteral_1= 'OutputArrow' )
                    // InternalSiriusTextDsl.g:5102:8: enumLiteral_1= 'OutputArrow'
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5108:6: (enumLiteral_2= 'InputArrow' )
                    {
                    // InternalSiriusTextDsl.g:5108:6: (enumLiteral_2= 'InputArrow' )
                    // InternalSiriusTextDsl.g:5108:8: enumLiteral_2= 'InputArrow'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:5114:6: (enumLiteral_3= 'OutputClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:5114:6: (enumLiteral_3= 'OutputClosedArrow' )
                    // InternalSiriusTextDsl.g:5114:8: enumLiteral_3= 'OutputClosedArrow'
                    {
                    enumLiteral_3=(Token)match(input,126,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:5120:6: (enumLiteral_4= 'InputClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:5120:6: (enumLiteral_4= 'InputClosedArrow' )
                    // InternalSiriusTextDsl.g:5120:8: enumLiteral_4= 'InputClosedArrow'
                    {
                    enumLiteral_4=(Token)match(input,127,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:5126:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:5126:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:5126:8: enumLiteral_5= 'OutputFillClosedArrow'
                    {
                    enumLiteral_5=(Token)match(input,128,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:5132:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:5132:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:5132:8: enumLiteral_6= 'InputFillClosedArrow'
                    {
                    enumLiteral_6=(Token)match(input,129,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:5138:6: (enumLiteral_7= 'Diamond' )
                    {
                    // InternalSiriusTextDsl.g:5138:6: (enumLiteral_7= 'Diamond' )
                    // InternalSiriusTextDsl.g:5138:8: enumLiteral_7= 'Diamond'
                    {
                    enumLiteral_7=(Token)match(input,130,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:5144:6: (enumLiteral_8= 'FillDiamond' )
                    {
                    // InternalSiriusTextDsl.g:5144:6: (enumLiteral_8= 'FillDiamond' )
                    // InternalSiriusTextDsl.g:5144:8: enumLiteral_8= 'FillDiamond'
                    {
                    enumLiteral_8=(Token)match(input,131,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalSiriusTextDsl.g:5150:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    {
                    // InternalSiriusTextDsl.g:5150:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    // InternalSiriusTextDsl.g:5150:8: enumLiteral_9= 'InputArrowWithDiamond'
                    {
                    enumLiteral_9=(Token)match(input,132,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalSiriusTextDsl.g:5156:6: (enumLiteral_10= 'InputArrowWithFillDiamond' )
                    {
                    // InternalSiriusTextDsl.g:5156:6: (enumLiteral_10= 'InputArrowWithFillDiamond' )
                    // InternalSiriusTextDsl.g:5156:8: enumLiteral_10= 'InputArrowWithFillDiamond'
                    {
                    enumLiteral_10=(Token)match(input,133,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getArrowDecoratorAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrowDecorator"


    // $ANTLR start "ruleFoldingStyle"
    // InternalSiriusTextDsl.g:5166:1: ruleFoldingStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) ) ;
    public final Enumerator ruleFoldingStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5168:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) ) )
            // InternalSiriusTextDsl.g:5169:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) )
            {
            // InternalSiriusTextDsl.g:5169:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) )
            int alt122=3;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt122=1;
                }
                break;
            case 135:
                {
                alt122=2;
                }
                break;
            case 136:
                {
                alt122=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // InternalSiriusTextDsl.g:5169:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSiriusTextDsl.g:5169:2: (enumLiteral_0= 'none' )
                    // InternalSiriusTextDsl.g:5169:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,134,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5175:6: (enumLiteral_1= 'source' )
                    {
                    // InternalSiriusTextDsl.g:5175:6: (enumLiteral_1= 'source' )
                    // InternalSiriusTextDsl.g:5175:8: enumLiteral_1= 'source'
                    {
                    enumLiteral_1=(Token)match(input,135,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5181:6: (enumLiteral_2= 'target' )
                    {
                    // InternalSiriusTextDsl.g:5181:6: (enumLiteral_2= 'target' )
                    // InternalSiriusTextDsl.g:5181:8: enumLiteral_2= 'target'
                    {
                    enumLiteral_2=(Token)match(input,136,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getTargetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFoldingStyleAccess().getTargetEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoldingStyle"


    // $ANTLR start "ruleEndsCentering"
    // InternalSiriusTextDsl.g:5191:1: ruleEndsCentering returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) ) ;
    public final Enumerator ruleEndsCentering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5193:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) ) )
            // InternalSiriusTextDsl.g:5194:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) )
            {
            // InternalSiriusTextDsl.g:5194:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) )
            int alt123=4;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt123=1;
                }
                break;
            case 137:
                {
                alt123=2;
                }
                break;
            case 135:
                {
                alt123=3;
                }
                break;
            case 136:
                {
                alt123=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // InternalSiriusTextDsl.g:5194:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSiriusTextDsl.g:5194:2: (enumLiteral_0= 'none' )
                    // InternalSiriusTextDsl.g:5194:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,134,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5200:6: (enumLiteral_1= 'both' )
                    {
                    // InternalSiriusTextDsl.g:5200:6: (enumLiteral_1= 'both' )
                    // InternalSiriusTextDsl.g:5200:8: enumLiteral_1= 'both'
                    {
                    enumLiteral_1=(Token)match(input,137,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5206:6: (enumLiteral_2= 'source' )
                    {
                    // InternalSiriusTextDsl.g:5206:6: (enumLiteral_2= 'source' )
                    // InternalSiriusTextDsl.g:5206:8: enumLiteral_2= 'source'
                    {
                    enumLiteral_2=(Token)match(input,135,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:5212:6: (enumLiteral_3= 'target' )
                    {
                    // InternalSiriusTextDsl.g:5212:6: (enumLiteral_3= 'target' )
                    // InternalSiriusTextDsl.g:5212:8: enumLiteral_3= 'target'
                    {
                    enumLiteral_3=(Token)match(input,136,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getTargetEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEndsCenteringAccess().getTargetEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndsCentering"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\1\17\11\uffff";
    static final String dfa_3s = "\2\153\11\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\2\14\uffff\4\3\12\uffff\1\4\3\uffff\1\11\1\uffff\2\12\40\uffff\2\5\2\uffff\1\6\10\uffff\1\10\3\uffff\1\6\7\uffff\1\7",
            "\1\2\14\uffff\4\3\12\uffff\1\4\3\uffff\1\11\1\uffff\2\12\40\uffff\2\5\2\uffff\1\6\10\uffff\1\10\13\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00034400F000C010L,0x00000808804C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E140000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000003E000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000003C000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000038000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000030000040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000380002040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000380000040000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000300000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800002040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000001000030000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000002000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x9A00000800040000L,0x000000000000B492L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0008000000800000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000040000L,0x0000000000030000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000040000L,0x0000000000300000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x000E000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000002040000L,0x000000006A000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000002040000L,0x0000000068000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000002040000L,0x0000000060000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000040000L,0x0000000060000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000010000L,0x0000000000100000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000020000L,0x0000003000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000020000L,0x0000002000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000040000L,0x000007C000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0xF800000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000040000L,0x0000078000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000040000L,0x0000070000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000040000L,0x0000060000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000040000L,0x0000100000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});

}