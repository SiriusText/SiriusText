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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION", "RULE_ID", "RULE_STRING", "RULE_EXPRESSION", "RULE_INT", "RULE_WS", "'package'", "'.'", "'.*'", "'import'", "'designer'", "'as'", "'{'", "'}'", "'viewpoint'", "'modelFileExtensions'", "'='", "'['", "','", "']'", "'icon'", "'representations'", "'@Initialized'", "'@ShowOnStartup'", "'@EnablePopupBars'", "'@MetamodelUris'", "'({'", "'})'", "'diagram'", "'for'", "'?'", "'documentation'", "'titleExpression'", "'rootExpression'", "'defaultLayer'", "'additionalLayers'", "'layer'", "'mappings'", "'edges'", "'list'", "'container'", "'style'", "'semanticCandidatesExpression'", "'if'", "'gradient'", "'from'", "'to'", "'label'", "'in'", "'border'", "'size'", "'heightComputationExpression'", "'widthComputationExpression'", "'relationBasedEdge'", "'sourceMappings'", "'targetMappings'", "'targetFileExpression'", "'edgeStyle'", "'line'", "'routing'", "'sourceArrow'", "'targetArrow'", "'sizeComputationExpression'", "'foldingStyle'", "'endsCentering'", "'palette'", "'color'", "'rgb('", "')'", "'left'", "'center'", "'right'", "'oblique'", "'lefttoright'", "'toptobottom'", "'solid'", "'dash'", "'dot'", "'dash_dot'", "'straight'", "'manhattan'", "'tree'", "'NoDecoration'", "'OutputArrow'", "'InputArrow'", "'OutputClosedArrow'", "'InputClosedArrow'", "'OutputFillClosedArrow'", "'InputFillClosedArrow'", "'Diamond'", "'FillDiamond'", "'InputArrowWithDiamond'", "'InputArrowWithFillDiamond'", "'none'", "'source'", "'target'", "'both'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int T__94=94;
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
    public static final int T__10=10;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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

            otherlv_1=(Token)match(input,10,FOLLOW_4); 

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

                if ( (LA2_0==13) ) {
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
    // InternalSiriusTextDsl.g:174:1: ruleSiriusFileBody returns [EObject current=null] : (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge ) ;
    public final EObject ruleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject this_Designer_0 = null;

        EObject this_Representation_1 = null;

        EObject this_Layer_2 = null;

        EObject this_Mapping_3 = null;

        EObject this_Style_4 = null;

        EObject this_Palette_5 = null;

        EObject this_Edge_6 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:177:28: ( (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge ) )
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge )
            {
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge )
            int alt3=7;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    alt3=5;
                    }
                    break;
                case 14:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                    {
                    alt3=2;
                    }
                    break;
                case 69:
                    {
                    alt3=6;
                    }
                    break;
                case 57:
                    {
                    alt3=7;
                    }
                    break;
                case 43:
                case 44:
                    {
                    alt3=4;
                    }
                    break;
                case 40:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                alt3=1;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 43:
            case 44:
                {
                alt3=4;
                }
                break;
            case 48:
            case 61:
                {
                alt3=5;
                }
                break;
            case 69:
                {
                alt3=6;
                }
                break;
            case 57:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

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
    // InternalSiriusTextDsl.g:255:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSiriusTextDsl.g:256:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSiriusTextDsl.g:257:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSiriusTextDsl.g:264:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:267:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSiriusTextDsl.g:268:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSiriusTextDsl.g:268:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSiriusTextDsl.g:268:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSiriusTextDsl.g:275:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:276:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_4); 

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
    // InternalSiriusTextDsl.g:296:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSiriusTextDsl.g:297:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSiriusTextDsl.g:298:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalSiriusTextDsl.g:305:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:308:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSiriusTextDsl.g:309:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSiriusTextDsl.g:309:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSiriusTextDsl.g:310:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalSiriusTextDsl.g:320:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSiriusTextDsl.g:321:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:334:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSiriusTextDsl.g:335:2: (iv_ruleImport= ruleImport EOF )
            // InternalSiriusTextDsl.g:336:2: iv_ruleImport= ruleImport EOF
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
    // InternalSiriusTextDsl.g:343:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:346:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSiriusTextDsl.g:347:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSiriusTextDsl.g:347:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSiriusTextDsl.g:347:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalSiriusTextDsl.g:351:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSiriusTextDsl.g:352:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSiriusTextDsl.g:352:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalSiriusTextDsl.g:353:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalSiriusTextDsl.g:377:1: entryRuleDesigner returns [EObject current=null] : iv_ruleDesigner= ruleDesigner EOF ;
    public final EObject entryRuleDesigner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesigner = null;


        try {
            // InternalSiriusTextDsl.g:378:2: (iv_ruleDesigner= ruleDesigner EOF )
            // InternalSiriusTextDsl.g:379:2: iv_ruleDesigner= ruleDesigner EOF
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
    // InternalSiriusTextDsl.g:386:1: ruleDesigner returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) ;
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
            // InternalSiriusTextDsl.g:389:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) )
            // InternalSiriusTextDsl.g:390:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            {
            // InternalSiriusTextDsl.g:390:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            // InternalSiriusTextDsl.g:390:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}'
            {
            // InternalSiriusTextDsl.g:390:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCUMENTATION) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSiriusTextDsl.g:391:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:391:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:392:3: lv_documentation_0_0= RULE_DOCUMENTATION
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

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getDesignerAccess().getDesignerKeyword_1());
                
            // InternalSiriusTextDsl.g:412:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:413:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:413:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:414:3: lv_name_2_0= RULE_ID
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

            // InternalSiriusTextDsl.g:430:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSiriusTextDsl.g:430:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getDesignerAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:434:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:435:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:435:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:436:3: lv_label_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,16,FOLLOW_12); 

                	newLeafNode(otherlv_5, grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:456:1: ( (lv_viewpoints_6_0= ruleViewpoint ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOCUMENTATION||LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:457:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    {
            	    // InternalSiriusTextDsl.g:457:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    // InternalSiriusTextDsl.g:458:3: lv_viewpoints_6_0= ruleViewpoint
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

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:486:1: entryRuleViewpoint returns [EObject current=null] : iv_ruleViewpoint= ruleViewpoint EOF ;
    public final EObject entryRuleViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpoint = null;


        try {
            // InternalSiriusTextDsl.g:487:2: (iv_ruleViewpoint= ruleViewpoint EOF )
            // InternalSiriusTextDsl.g:488:2: iv_ruleViewpoint= ruleViewpoint EOF
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
    // InternalSiriusTextDsl.g:495:1: ruleViewpoint returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' ) ;
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

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:498:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' ) )
            // InternalSiriusTextDsl.g:499:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' )
            {
            // InternalSiriusTextDsl.g:499:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' )
            // InternalSiriusTextDsl.g:499:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}'
            {
            // InternalSiriusTextDsl.g:499:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOCUMENTATION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSiriusTextDsl.g:500:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:500:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:501:3: lv_documentation_0_0= RULE_DOCUMENTATION
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

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getViewpointAccess().getViewpointKeyword_1());
                
            // InternalSiriusTextDsl.g:521:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:522:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:522:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:523:3: lv_name_2_0= RULE_ID
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

            // InternalSiriusTextDsl.g:539:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSiriusTextDsl.g:539:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getViewpointAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:543:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:544:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:544:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:545:3: lv_label_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,16,FOLLOW_14); 

                	newLeafNode(otherlv_5, grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:565:1: (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSiriusTextDsl.g:565:3: otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_15); 

                        	newLeafNode(otherlv_6, grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_7, grammarAccess.getViewpointAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_8, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:577:1: ( (lv_modelFileExtensions_9_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:578:1: (lv_modelFileExtensions_9_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:578:1: (lv_modelFileExtensions_9_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:579:3: lv_modelFileExtensions_9_0= RULE_STRING
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

                    // InternalSiriusTextDsl.g:595:2: (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:595:4: otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,22,FOLLOW_10); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getViewpointAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // InternalSiriusTextDsl.g:599:1: ( (lv_modelFileExtensions_11_0= RULE_STRING ) )
                    	    // InternalSiriusTextDsl.g:600:1: (lv_modelFileExtensions_11_0= RULE_STRING )
                    	    {
                    	    // InternalSiriusTextDsl.g:600:1: (lv_modelFileExtensions_11_0= RULE_STRING )
                    	    // InternalSiriusTextDsl.g:601:3: lv_modelFileExtensions_11_0= RULE_STRING
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

                    otherlv_12=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_12, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_5_5());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:621:3: (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSiriusTextDsl.g:621:5: otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_13, grammarAccess.getViewpointAccess().getIconKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_14, grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1());
                        
                    // InternalSiriusTextDsl.g:629:1: ( (lv_icon_15_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:630:1: (lv_icon_15_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:630:1: (lv_icon_15_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:631:3: lv_icon_15_0= RULE_STRING
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

            // InternalSiriusTextDsl.g:647:4: (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSiriusTextDsl.g:647:6: otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']'
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0());
                        
                    otherlv_17=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_17, grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_18=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_18, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2());
                        
                    // InternalSiriusTextDsl.g:659:1: ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSiriusTextDsl.g:659:2: ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:659:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:660:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:660:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:661:3: ruleQualifiedName
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

                            // InternalSiriusTextDsl.g:674:2: (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==22) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:674:4: otherlv_20= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_20=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_20, grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:678:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:679:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:679:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:680:3: ruleQualifiedName
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

                    otherlv_22=(Token)match(input,23,FOLLOW_21); 

                        	newLeafNode(otherlv_22, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_23, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_8());
                

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
    // InternalSiriusTextDsl.g:709:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // InternalSiriusTextDsl.g:710:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // InternalSiriusTextDsl.g:711:2: iv_ruleRepresentation= ruleRepresentation EOF
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
    // InternalSiriusTextDsl.g:718:1: ruleRepresentation returns [EObject current=null] : this_Diagram_0= ruleDiagram ;
    public final EObject ruleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_Diagram_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:721:28: (this_Diagram_0= ruleDiagram )
            // InternalSiriusTextDsl.g:723:5: this_Diagram_0= ruleDiagram
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
    // InternalSiriusTextDsl.g:739:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalSiriusTextDsl.g:740:2: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalSiriusTextDsl.g:741:2: iv_ruleDiagram= ruleDiagram EOF
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
    // InternalSiriusTextDsl.g:748:1: ruleDiagram returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) ;
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
            // InternalSiriusTextDsl.g:751:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) )
            // InternalSiriusTextDsl.g:752:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            {
            // InternalSiriusTextDsl.g:752:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            // InternalSiriusTextDsl.g:752:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}'
            {
            // InternalSiriusTextDsl.g:752:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOCUMENTATION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSiriusTextDsl.g:753:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:753:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:754:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_22); 

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

            // InternalSiriusTextDsl.g:770:3: ( (lv_initialized_1_0= '@Initialized' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSiriusTextDsl.g:771:1: (lv_initialized_1_0= '@Initialized' )
                    {
                    // InternalSiriusTextDsl.g:771:1: (lv_initialized_1_0= '@Initialized' )
                    // InternalSiriusTextDsl.g:772:3: lv_initialized_1_0= '@Initialized'
                    {
                    lv_initialized_1_0=(Token)match(input,26,FOLLOW_23); 

                            newLeafNode(lv_initialized_1_0, grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "initialized", true, "@Initialized");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:785:3: ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSiriusTextDsl.g:786:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    {
                    // InternalSiriusTextDsl.g:786:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    // InternalSiriusTextDsl.g:787:3: lv_showOnStartup_2_0= '@ShowOnStartup'
                    {
                    lv_showOnStartup_2_0=(Token)match(input,27,FOLLOW_24); 

                            newLeafNode(lv_showOnStartup_2_0, grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "showOnStartup", true, "@ShowOnStartup");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:800:3: ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSiriusTextDsl.g:801:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    {
                    // InternalSiriusTextDsl.g:801:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    // InternalSiriusTextDsl.g:802:3: lv_enablePopupBars_3_0= '@EnablePopupBars'
                    {
                    lv_enablePopupBars_3_0=(Token)match(input,28,FOLLOW_25); 

                            newLeafNode(lv_enablePopupBars_3_0, grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "enablePopupBars", true, "@EnablePopupBars");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:815:3: (otherlv_4= '@MetamodelUris' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:815:5: otherlv_4= '@MetamodelUris'
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_26); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_10); 

                	newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_5());
                
            // InternalSiriusTextDsl.g:823:1: ( (lv_metamodelUris_6_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:824:1: (lv_metamodelUris_6_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:824:1: (lv_metamodelUris_6_0= RULE_STRING )
            // InternalSiriusTextDsl.g:825:3: lv_metamodelUris_6_0= RULE_STRING
            {
            lv_metamodelUris_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            // InternalSiriusTextDsl.g:841:2: (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:841:4: otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_10); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDiagramAccess().getCommaKeyword_7_0());
            	        
            	    // InternalSiriusTextDsl.g:845:1: ( (lv_metamodelUris_8_0= RULE_STRING ) )
            	    // InternalSiriusTextDsl.g:846:1: (lv_metamodelUris_8_0= RULE_STRING )
            	    {
            	    // InternalSiriusTextDsl.g:846:1: (lv_metamodelUris_8_0= RULE_STRING )
            	    // InternalSiriusTextDsl.g:847:3: lv_metamodelUris_8_0= RULE_STRING
            	    {
            	    lv_metamodelUris_8_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,31,FOLLOW_28); 

                	newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,32,FOLLOW_4); 

                	newLeafNode(otherlv_10, grammarAccess.getDiagramAccess().getDiagramKeyword_9());
                
            // InternalSiriusTextDsl.g:871:1: ( (lv_name_11_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:872:1: (lv_name_11_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:872:1: (lv_name_11_0= RULE_ID )
            // InternalSiriusTextDsl.g:873:3: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalSiriusTextDsl.g:889:2: (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSiriusTextDsl.g:889:4: otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_12, grammarAccess.getDiagramAccess().getAsKeyword_11_0());
                        
                    // InternalSiriusTextDsl.g:893:1: ( (lv_label_13_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:894:1: (lv_label_13_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:894:1: (lv_label_13_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:895:3: lv_label_13_0= RULE_STRING
                    {
                    lv_label_13_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            otherlv_14=(Token)match(input,33,FOLLOW_10); 

                	newLeafNode(otherlv_14, grammarAccess.getDiagramAccess().getForKeyword_12());
                
            // InternalSiriusTextDsl.g:915:1: ( (lv_domainClass_15_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:916:1: (lv_domainClass_15_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:916:1: (lv_domainClass_15_0= RULE_STRING )
            // InternalSiriusTextDsl.g:917:3: lv_domainClass_15_0= RULE_STRING
            {
            lv_domainClass_15_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            // InternalSiriusTextDsl.g:933:2: (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSiriusTextDsl.g:933:4: otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) )
                    {
                    otherlv_16=(Token)match(input,34,FOLLOW_32); 

                        	newLeafNode(otherlv_16, grammarAccess.getDiagramAccess().getQuestionMarkKeyword_14_0());
                        
                    // InternalSiriusTextDsl.g:937:1: ( (lv_precondition_17_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:938:1: (lv_precondition_17_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:938:1: (lv_precondition_17_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:939:3: lv_precondition_17_0= RULE_EXPRESSION
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

            otherlv_18=(Token)match(input,16,FOLLOW_33); 

                	newLeafNode(otherlv_18, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_15());
                
            // InternalSiriusTextDsl.g:959:1: (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSiriusTextDsl.g:959:3: otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,35,FOLLOW_15); 

                        	newLeafNode(otherlv_19, grammarAccess.getDiagramAccess().getDocumentationKeyword_16_0());
                        
                    otherlv_20=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_20, grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1());
                        
                    // InternalSiriusTextDsl.g:967:1: ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:968:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:968:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:969:3: lv_endUserDocumentation_21_0= RULE_STRING
                    {
                    lv_endUserDocumentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            // InternalSiriusTextDsl.g:985:4: (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSiriusTextDsl.g:985:6: otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    {
                    otherlv_22=(Token)match(input,36,FOLLOW_15); 

                        	newLeafNode(otherlv_22, grammarAccess.getDiagramAccess().getTitleExpressionKeyword_17_0());
                        
                    otherlv_23=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_23, grammarAccess.getDiagramAccess().getEqualsSignKeyword_17_1());
                        
                    // InternalSiriusTextDsl.g:993:1: ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:994:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:994:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:995:3: lv_titleExpression_24_0= RULE_EXPRESSION
                    {
                    lv_titleExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_35); 

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

            // InternalSiriusTextDsl.g:1011:4: (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSiriusTextDsl.g:1011:6: otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    {
                    otherlv_25=(Token)match(input,37,FOLLOW_15); 

                        	newLeafNode(otherlv_25, grammarAccess.getDiagramAccess().getRootExpressionKeyword_18_0());
                        
                    otherlv_26=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_26, grammarAccess.getDiagramAccess().getEqualsSignKeyword_18_1());
                        
                    // InternalSiriusTextDsl.g:1019:1: ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1020:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1020:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1021:3: lv_rootExpression_27_0= RULE_EXPRESSION
                    {
                    lv_rootExpression_27_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_36); 

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

            // InternalSiriusTextDsl.g:1037:4: (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSiriusTextDsl.g:1037:6: otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) )
                    {
                    otherlv_28=(Token)match(input,38,FOLLOW_15); 

                        	newLeafNode(otherlv_28, grammarAccess.getDiagramAccess().getDefaultLayerKeyword_19_0());
                        
                    otherlv_29=(Token)match(input,20,FOLLOW_4); 

                        	newLeafNode(otherlv_29, grammarAccess.getDiagramAccess().getEqualsSignKeyword_19_1());
                        
                    // InternalSiriusTextDsl.g:1045:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1046:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1046:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1047:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 
                    	    
                    pushFollow(FOLLOW_37);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1060:4: (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSiriusTextDsl.g:1060:6: otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']'
                    {
                    otherlv_31=(Token)match(input,39,FOLLOW_15); 

                        	newLeafNode(otherlv_31, grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0());
                        
                    otherlv_32=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_32, grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1());
                        
                    otherlv_33=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_33, grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2());
                        
                    // InternalSiriusTextDsl.g:1072:1: ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1072:2: ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1072:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1073:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1073:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1074:3: ruleQualifiedName
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

                            // InternalSiriusTextDsl.g:1087:2: (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==22) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1087:4: otherlv_35= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_35=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_35, grammarAccess.getDiagramAccess().getCommaKeyword_20_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1091:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1092:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1092:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1093:3: ruleQualifiedName
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
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_37=(Token)match(input,23,FOLLOW_21); 

                        	newLeafNode(otherlv_37, grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4());
                        

                    }
                    break;

            }

            otherlv_38=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:1122:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalSiriusTextDsl.g:1123:2: (iv_ruleLayer= ruleLayer EOF )
            // InternalSiriusTextDsl.g:1124:2: iv_ruleLayer= ruleLayer EOF
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
    // InternalSiriusTextDsl.g:1131:1: ruleLayer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' otherlv_21= '}' ) ;
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

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1134:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' otherlv_21= '}' ) )
            // InternalSiriusTextDsl.g:1135:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' otherlv_21= '}' )
            {
            // InternalSiriusTextDsl.g:1135:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' otherlv_21= '}' )
            // InternalSiriusTextDsl.g:1135:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' otherlv_21= '}'
            {
            // InternalSiriusTextDsl.g:1135:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DOCUMENTATION) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSiriusTextDsl.g:1136:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1136:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1137:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_38); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
                
            // InternalSiriusTextDsl.g:1157:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1158:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1158:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:1159:3: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,16,FOLLOW_39); 

                	newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:1179:1: (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSiriusTextDsl.g:1179:3: otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getIconKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:1187:1: ( (lv_icon_6_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1188:1: (lv_icon_6_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1188:1: (lv_icon_6_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1189:3: lv_icon_6_0= RULE_STRING
                    {
                    lv_icon_6_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

            otherlv_7=(Token)match(input,41,FOLLOW_15); 

                	newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getMappingsKeyword_5());
                
            otherlv_8=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_8, grammarAccess.getLayerAccess().getEqualsSignKeyword_6());
                
            otherlv_9=(Token)match(input,21,FOLLOW_20); 

                	newLeafNode(otherlv_9, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7());
                
            // InternalSiriusTextDsl.g:1217:1: ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSiriusTextDsl.g:1217:2: ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:1217:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1218:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1218:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1219:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:1232:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==22) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:1232:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_4); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getLayerAccess().getCommaKeyword_8_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:1236:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:1237:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:1237:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:1238:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLayerRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_41); 

                	newLeafNode(otherlv_13, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_9());
                
            otherlv_14=(Token)match(input,42,FOLLOW_15); 

                	newLeafNode(otherlv_14, grammarAccess.getLayerAccess().getEdgesKeyword_10());
                
            otherlv_15=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_15, grammarAccess.getLayerAccess().getEqualsSignKeyword_11());
                
            otherlv_16=(Token)match(input,21,FOLLOW_20); 

                	newLeafNode(otherlv_16, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_12());
                
            // InternalSiriusTextDsl.g:1267:1: ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSiriusTextDsl.g:1267:2: ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:1267:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1268:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1268:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1269:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_13_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:1282:2: (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==22) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:1282:4: otherlv_18= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_18=(Token)match(input,22,FOLLOW_4); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getLayerAccess().getCommaKeyword_13_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:1286:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:1287:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:1287:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:1288:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLayerRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_13_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,23,FOLLOW_21); 

                	newLeafNode(otherlv_20, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_14());
                
            otherlv_21=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_21, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_15());
                

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


    // $ANTLR start "entryRuleMapping"
    // InternalSiriusTextDsl.g:1317:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalSiriusTextDsl.g:1318:2: (iv_ruleMapping= ruleMapping EOF )
            // InternalSiriusTextDsl.g:1319:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalSiriusTextDsl.g:1326:1: ruleMapping returns [EObject current=null] : this_Container_0= ruleContainer ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1329:28: (this_Container_0= ruleContainer )
            // InternalSiriusTextDsl.g:1331:5: this_Container_0= ruleContainer
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
    // InternalSiriusTextDsl.g:1347:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSiriusTextDsl.g:1348:2: (iv_ruleContainer= ruleContainer EOF )
            // InternalSiriusTextDsl.g:1349:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalSiriusTextDsl.g:1356:1: ruleContainer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' ) ;
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
            // InternalSiriusTextDsl.g:1359:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' ) )
            // InternalSiriusTextDsl.g:1360:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' )
            {
            // InternalSiriusTextDsl.g:1360:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' )
            // InternalSiriusTextDsl.g:1360:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}'
            {
            // InternalSiriusTextDsl.g:1360:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_DOCUMENTATION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSiriusTextDsl.g:1361:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1361:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1362:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_42); 

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

            // InternalSiriusTextDsl.g:1378:3: ( (lv_list_1_0= 'list' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSiriusTextDsl.g:1379:1: (lv_list_1_0= 'list' )
                    {
                    // InternalSiriusTextDsl.g:1379:1: (lv_list_1_0= 'list' )
                    // InternalSiriusTextDsl.g:1380:3: lv_list_1_0= 'list'
                    {
                    lv_list_1_0=(Token)match(input,43,FOLLOW_43); 

                            newLeafNode(lv_list_1_0, grammarAccess.getContainerAccess().getListListKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "list", true, "list");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getContainerKeyword_2());
                
            // InternalSiriusTextDsl.g:1397:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1398:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1398:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:1399:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalSiriusTextDsl.g:1415:2: (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSiriusTextDsl.g:1415:4: otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAsKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:1419:1: ( (lv_label_5_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1420:1: (lv_label_5_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1420:1: (lv_label_5_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1421:3: lv_label_5_0= RULE_STRING
                    {
                    lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            otherlv_6=(Token)match(input,33,FOLLOW_10); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getForKeyword_5());
                
            // InternalSiriusTextDsl.g:1441:1: ( (lv_domainClass_7_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:1442:1: (lv_domainClass_7_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:1442:1: (lv_domainClass_7_0= RULE_STRING )
            // InternalSiriusTextDsl.g:1443:3: lv_domainClass_7_0= RULE_STRING
            {
            lv_domainClass_7_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            otherlv_8=(Token)match(input,45,FOLLOW_4); 

                	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getStyleKeyword_7());
                
            // InternalSiriusTextDsl.g:1463:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1464:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1464:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1465:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:1478:2: (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==34) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSiriusTextDsl.g:1478:4: otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_32); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:1482:1: ( (lv_precondition_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1483:1: (lv_precondition_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1483:1: (lv_precondition_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1484:3: lv_precondition_11_0= RULE_EXPRESSION
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

            otherlv_12=(Token)match(input,16,FOLLOW_45); 

                	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10());
                
            // InternalSiriusTextDsl.g:1504:1: (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSiriusTextDsl.g:1504:3: otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) )
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_15); 

                        	newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0());
                        
                    otherlv_14=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:1512:1: ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1513:1: (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1513:1: (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1514:3: lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION
                    {
                    lv_semanticCanditatesExpression_15_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_46); 

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

            // InternalSiriusTextDsl.g:1530:4: ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==45) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1531:1: (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration )
            	    {
            	    // InternalSiriusTextDsl.g:1531:1: (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration )
            	    // InternalSiriusTextDsl.g:1532:3: lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_46);
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
            	    break loop43;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:1560:1: entryRuleConditionalContainerStyleDeclaration returns [EObject current=null] : iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF ;
    public final EObject entryRuleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalContainerStyleDeclaration = null;


        try {
            // InternalSiriusTextDsl.g:1561:2: (iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF )
            // InternalSiriusTextDsl.g:1562:2: iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF
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
    // InternalSiriusTextDsl.g:1569:1: ruleConditionalContainerStyleDeclaration returns [EObject current=null] : (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) ;
    public final EObject ruleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_conditionalStyleExpression_3_0=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1572:28: ( (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) )
            // InternalSiriusTextDsl.g:1573:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            {
            // InternalSiriusTextDsl.g:1573:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            // InternalSiriusTextDsl.g:1573:3: otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:1577:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1578:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1578:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1579:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_47);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_32); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2());
                
            // InternalSiriusTextDsl.g:1596:1: ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:1597:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:1597:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:1598:3: lv_conditionalStyleExpression_3_0= RULE_EXPRESSION
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
    // InternalSiriusTextDsl.g:1622:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalSiriusTextDsl.g:1623:2: (iv_ruleStyle= ruleStyle EOF )
            // InternalSiriusTextDsl.g:1624:2: iv_ruleStyle= ruleStyle EOF
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
    // InternalSiriusTextDsl.g:1631:1: ruleStyle returns [EObject current=null] : (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerStyle_0 = null;

        EObject this_EdgeStyle_1 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1634:28: ( (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle ) )
            // InternalSiriusTextDsl.g:1635:1: (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle )
            {
            // InternalSiriusTextDsl.g:1635:1: (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DOCUMENTATION||LA44_0==48) ) {
                alt44=1;
            }
            else if ( (LA44_0==61) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSiriusTextDsl.g:1636:5: this_ContainerStyle_0= ruleContainerStyle
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
                    // InternalSiriusTextDsl.g:1646:5: this_EdgeStyle_1= ruleEdgeStyle
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
    // InternalSiriusTextDsl.g:1662:1: entryRuleContainerStyle returns [EObject current=null] : iv_ruleContainerStyle= ruleContainerStyle EOF ;
    public final EObject entryRuleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerStyle = null;


        try {
            // InternalSiriusTextDsl.g:1663:2: (iv_ruleContainerStyle= ruleContainerStyle EOF )
            // InternalSiriusTextDsl.g:1664:2: iv_ruleContainerStyle= ruleContainerStyle EOF
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
    // InternalSiriusTextDsl.g:1671:1: ruleContainerStyle returns [EObject current=null] : this_Gradient_0= ruleGradient ;
    public final EObject ruleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject this_Gradient_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1674:28: (this_Gradient_0= ruleGradient )
            // InternalSiriusTextDsl.g:1676:5: this_Gradient_0= ruleGradient
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
    // InternalSiriusTextDsl.g:1692:1: entryRuleGradient returns [EObject current=null] : iv_ruleGradient= ruleGradient EOF ;
    public final EObject entryRuleGradient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradient = null;


        try {
            // InternalSiriusTextDsl.g:1693:2: (iv_ruleGradient= ruleGradient EOF )
            // InternalSiriusTextDsl.g:1694:2: iv_ruleGradient= ruleGradient EOF
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
    // InternalSiriusTextDsl.g:1701:1: ruleGradient returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' ) ;
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
            // InternalSiriusTextDsl.g:1704:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' ) )
            // InternalSiriusTextDsl.g:1705:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' )
            {
            // InternalSiriusTextDsl.g:1705:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' )
            // InternalSiriusTextDsl.g:1705:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}'
            {
            // InternalSiriusTextDsl.g:1705:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DOCUMENTATION) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSiriusTextDsl.g:1706:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1706:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1707:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_48); 

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

            otherlv_1=(Token)match(input,48,FOLLOW_49); 

                	newLeafNode(otherlv_1, grammarAccess.getGradientAccess().getGradientKeyword_1());
                
            // InternalSiriusTextDsl.g:1727:1: ( (lv_direction_2_0= ruleGradientDirection ) )
            // InternalSiriusTextDsl.g:1728:1: (lv_direction_2_0= ruleGradientDirection )
            {
            // InternalSiriusTextDsl.g:1728:1: (lv_direction_2_0= ruleGradientDirection )
            // InternalSiriusTextDsl.g:1729:3: lv_direction_2_0= ruleGradientDirection
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

            // InternalSiriusTextDsl.g:1745:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1746:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1746:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:1747:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_50); 

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

            otherlv_4=(Token)match(input,49,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getGradientAccess().getFromKeyword_4());
                
            // InternalSiriusTextDsl.g:1767:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1768:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1768:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1769:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_51);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,50,FOLLOW_4); 

                	newLeafNode(otherlv_6, grammarAccess.getGradientAccess().getToKeyword_6());
                
            // InternalSiriusTextDsl.g:1786:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1787:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1787:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1788:3: ruleQualifiedName
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

            otherlv_8=(Token)match(input,16,FOLLOW_52); 

                	newLeafNode(otherlv_8, grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalSiriusTextDsl.g:1805:1: (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSiriusTextDsl.g:1805:3: otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,51,FOLLOW_53); 

                        	newLeafNode(otherlv_9, grammarAccess.getGradientAccess().getLabelKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:1809:1: ( (lv_labelAlignment_10_0= ruleLabelAlignment ) )
                    // InternalSiriusTextDsl.g:1810:1: (lv_labelAlignment_10_0= ruleLabelAlignment )
                    {
                    // InternalSiriusTextDsl.g:1810:1: (lv_labelAlignment_10_0= ruleLabelAlignment )
                    // InternalSiriusTextDsl.g:1811:3: lv_labelAlignment_10_0= ruleLabelAlignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelAlignmentLabelAlignmentEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_32);
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

                    // InternalSiriusTextDsl.g:1827:2: ( (lv_labelExpression_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1828:1: (lv_labelExpression_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1828:1: (lv_labelExpression_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1829:3: lv_labelExpression_11_0= RULE_EXPRESSION
                    {
                    lv_labelExpression_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_54); 

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

                    otherlv_12=(Token)match(input,52,FOLLOW_4); 

                        	newLeafNode(otherlv_12, grammarAccess.getGradientAccess().getInKeyword_9_3());
                        
                    // InternalSiriusTextDsl.g:1849:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1850:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1850:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1851:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 
                    	    
                    pushFollow(FOLLOW_55);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1864:4: (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSiriusTextDsl.g:1864:6: otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,53,FOLLOW_56); 

                        	newLeafNode(otherlv_14, grammarAccess.getGradientAccess().getBorderKeyword_10_0());
                        
                    otherlv_15=(Token)match(input,54,FOLLOW_15); 

                        	newLeafNode(otherlv_15, grammarAccess.getGradientAccess().getSizeKeyword_10_1());
                        
                    otherlv_16=(Token)match(input,20,FOLLOW_57); 

                        	newLeafNode(otherlv_16, grammarAccess.getGradientAccess().getEqualsSignKeyword_10_2());
                        
                    // InternalSiriusTextDsl.g:1876:1: ( (lv_borderSize_17_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:1877:1: (lv_borderSize_17_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:1877:1: (lv_borderSize_17_0= RULE_INT )
                    // InternalSiriusTextDsl.g:1878:3: lv_borderSize_17_0= RULE_INT
                    {
                    lv_borderSize_17_0=(Token)match(input,RULE_INT,FOLLOW_54); 

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

                    otherlv_18=(Token)match(input,52,FOLLOW_4); 

                        	newLeafNode(otherlv_18, grammarAccess.getGradientAccess().getInKeyword_10_4());
                        
                    // InternalSiriusTextDsl.g:1898:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1899:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1899:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1900:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 
                    	    
                    pushFollow(FOLLOW_58);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1913:4: (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSiriusTextDsl.g:1913:6: otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_20, grammarAccess.getGradientAccess().getIconKeyword_11_0());
                        
                    otherlv_21=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_21, grammarAccess.getGradientAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:1921:1: ( (lv_icon_22_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1922:1: (lv_icon_22_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1922:1: (lv_icon_22_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1923:3: lv_icon_22_0= RULE_STRING
                    {
                    lv_icon_22_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

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

            // InternalSiriusTextDsl.g:1939:4: (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSiriusTextDsl.g:1939:6: otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) )
                    {
                    otherlv_23=(Token)match(input,55,FOLLOW_15); 

                        	newLeafNode(otherlv_23, grammarAccess.getGradientAccess().getHeightComputationExpressionKeyword_12_0());
                        
                    otherlv_24=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_24, grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:1947:1: ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1948:1: (lv_heightComputationExpression_25_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1948:1: (lv_heightComputationExpression_25_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1949:3: lv_heightComputationExpression_25_0= RULE_EXPRESSION
                    {
                    lv_heightComputationExpression_25_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_60); 

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

            // InternalSiriusTextDsl.g:1965:4: (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSiriusTextDsl.g:1965:6: otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) )
                    {
                    otherlv_26=(Token)match(input,56,FOLLOW_15); 

                        	newLeafNode(otherlv_26, grammarAccess.getGradientAccess().getWidthComputationExpressionKeyword_13_0());
                        
                    otherlv_27=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_27, grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1());
                        
                    // InternalSiriusTextDsl.g:1973:1: ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1974:1: (lv_widthComputationExpression_28_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1974:1: (lv_widthComputationExpression_28_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1975:3: lv_widthComputationExpression_28_0= RULE_EXPRESSION
                    {
                    lv_widthComputationExpression_28_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_21); 

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

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2003:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalSiriusTextDsl.g:2004:2: (iv_ruleEdge= ruleEdge EOF )
            // InternalSiriusTextDsl.g:2005:2: iv_ruleEdge= ruleEdge EOF
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
    // InternalSiriusTextDsl.g:2012:1: ruleEdge returns [EObject current=null] : this_RelationBasedEdge_0= ruleRelationBasedEdge ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        EObject this_RelationBasedEdge_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2015:28: (this_RelationBasedEdge_0= ruleRelationBasedEdge )
            // InternalSiriusTextDsl.g:2017:5: this_RelationBasedEdge_0= ruleRelationBasedEdge
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
    // InternalSiriusTextDsl.g:2033:1: entryRuleRelationBasedEdge returns [EObject current=null] : iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF ;
    public final EObject entryRuleRelationBasedEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationBasedEdge = null;


        try {
            // InternalSiriusTextDsl.g:2034:2: (iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF )
            // InternalSiriusTextDsl.g:2035:2: iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF
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
    // InternalSiriusTextDsl.g:2042:1: ruleRelationBasedEdge returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' ) ;
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
            // InternalSiriusTextDsl.g:2045:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' ) )
            // InternalSiriusTextDsl.g:2046:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' )
            {
            // InternalSiriusTextDsl.g:2046:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' )
            // InternalSiriusTextDsl.g:2046:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}'
            {
            // InternalSiriusTextDsl.g:2046:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_DOCUMENTATION) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSiriusTextDsl.g:2047:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:2047:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:2048:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_61); 

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

            otherlv_1=(Token)match(input,57,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationBasedEdgeAccess().getRelationBasedEdgeKeyword_1());
                
            // InternalSiriusTextDsl.g:2068:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:2069:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:2069:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:2070:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_62); 

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

            // InternalSiriusTextDsl.g:2086:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==15) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSiriusTextDsl.g:2086:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getRelationBasedEdgeAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:2090:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:2091:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:2091:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:2092:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            otherlv_5=(Token)match(input,45,FOLLOW_4); 

                	newLeafNode(otherlv_5, grammarAccess.getRelationBasedEdgeAccess().getStyleKeyword_4());
                
            // InternalSiriusTextDsl.g:2112:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:2113:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:2113:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:2114:3: ruleQualifiedName
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

            otherlv_7=(Token)match(input,16,FOLLOW_63); 

                	newLeafNode(otherlv_7, grammarAccess.getRelationBasedEdgeAccess().getLeftCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,58,FOLLOW_15); 

                	newLeafNode(otherlv_8, grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsKeyword_7());
                
            otherlv_9=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_9, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_8());
                
            otherlv_10=(Token)match(input,21,FOLLOW_20); 

                	newLeafNode(otherlv_10, grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_9());
                
            // InternalSiriusTextDsl.g:2143:1: ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSiriusTextDsl.g:2143:2: ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:2143:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:2144:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:2144:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:2145:3: ruleQualifiedName
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

                    // InternalSiriusTextDsl.g:2158:2: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==22) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2158:4: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,22,FOLLOW_4); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_10_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:2162:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:2163:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:2163:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:2164:3: ruleQualifiedName
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,23,FOLLOW_64); 

                	newLeafNode(otherlv_14, grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_11());
                
            otherlv_15=(Token)match(input,59,FOLLOW_15); 

                	newLeafNode(otherlv_15, grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsKeyword_12());
                
            otherlv_16=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_16, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_13());
                
            otherlv_17=(Token)match(input,21,FOLLOW_20); 

                	newLeafNode(otherlv_17, grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_14());
                
            // InternalSiriusTextDsl.g:2193:1: ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSiriusTextDsl.g:2193:2: ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:2193:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:2194:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:2194:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:2195:3: ruleQualifiedName
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

                    // InternalSiriusTextDsl.g:2208:2: (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==22) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2208:4: otherlv_19= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_19=(Token)match(input,22,FOLLOW_4); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_15_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:2212:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:2213:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:2213:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:2214:3: ruleQualifiedName
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
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,23,FOLLOW_65); 

                	newLeafNode(otherlv_21, grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_16());
                
            otherlv_22=(Token)match(input,60,FOLLOW_15); 

                	newLeafNode(otherlv_22, grammarAccess.getRelationBasedEdgeAccess().getTargetFileExpressionKeyword_17());
                
            otherlv_23=(Token)match(input,20,FOLLOW_32); 

                	newLeafNode(otherlv_23, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_18());
                
            // InternalSiriusTextDsl.g:2239:1: ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2240:1: (lv_targetFinderExpression_24_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2240:1: (lv_targetFinderExpression_24_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2241:3: lv_targetFinderExpression_24_0= RULE_EXPRESSION
            {
            lv_targetFinderExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_21); 

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

            otherlv_25=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2269:1: entryRuleEdgeStyle returns [EObject current=null] : iv_ruleEdgeStyle= ruleEdgeStyle EOF ;
    public final EObject entryRuleEdgeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeStyle = null;


        try {
            // InternalSiriusTextDsl.g:2270:2: (iv_ruleEdgeStyle= ruleEdgeStyle EOF )
            // InternalSiriusTextDsl.g:2271:2: iv_ruleEdgeStyle= ruleEdgeStyle EOF
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
    // InternalSiriusTextDsl.g:2278:1: ruleEdgeStyle returns [EObject current=null] : (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' ) ;
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
            // InternalSiriusTextDsl.g:2281:28: ( (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' ) )
            // InternalSiriusTextDsl.g:2282:1: (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' )
            {
            // InternalSiriusTextDsl.g:2282:1: (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' )
            // InternalSiriusTextDsl.g:2282:3: otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getEdgeStyleAccess().getEdgeStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:2286:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:2287:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:2287:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:2288:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_54); 

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

            otherlv_2=(Token)match(input,52,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getEdgeStyleAccess().getInKeyword_2());
                
            // InternalSiriusTextDsl.g:2308:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:2309:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:2309:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:2310:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeStyleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getStrokeColorColorCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_66);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:2323:2: (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==62) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSiriusTextDsl.g:2323:4: otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) )
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_15); 

                        	newLeafNode(otherlv_4, grammarAccess.getEdgeStyleAccess().getLineKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,20,FOLLOW_67); 

                        	newLeafNode(otherlv_5, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:2331:1: ( (lv_lineStyle_6_0= ruleLineStyle ) )
                    // InternalSiriusTextDsl.g:2332:1: (lv_lineStyle_6_0= ruleLineStyle )
                    {
                    // InternalSiriusTextDsl.g:2332:1: (lv_lineStyle_6_0= ruleLineStyle )
                    // InternalSiriusTextDsl.g:2333:3: lv_lineStyle_6_0= ruleLineStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_68);
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

            // InternalSiriusTextDsl.g:2349:4: (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==63) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSiriusTextDsl.g:2349:6: otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) )
                    {
                    otherlv_7=(Token)match(input,63,FOLLOW_15); 

                        	newLeafNode(otherlv_7, grammarAccess.getEdgeStyleAccess().getRoutingKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,20,FOLLOW_69); 

                        	newLeafNode(otherlv_8, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_5_1());
                        
                    // InternalSiriusTextDsl.g:2357:1: ( (lv_routingStyle_9_0= ruleRoutingStyle ) )
                    // InternalSiriusTextDsl.g:2358:1: (lv_routingStyle_9_0= ruleRoutingStyle )
                    {
                    // InternalSiriusTextDsl.g:2358:1: (lv_routingStyle_9_0= ruleRoutingStyle )
                    // InternalSiriusTextDsl.g:2359:3: lv_routingStyle_9_0= ruleRoutingStyle
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

            otherlv_10=(Token)match(input,16,FOLLOW_70); 

                	newLeafNode(otherlv_10, grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalSiriusTextDsl.g:2379:1: (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==64) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSiriusTextDsl.g:2379:3: otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) )
                    {
                    otherlv_11=(Token)match(input,64,FOLLOW_15); 

                        	newLeafNode(otherlv_11, grammarAccess.getEdgeStyleAccess().getSourceArrowKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,20,FOLLOW_71); 

                        	newLeafNode(otherlv_12, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_7_1());
                        
                    // InternalSiriusTextDsl.g:2387:1: ( (lv_sourceArrow_13_0= ruleArrowDecorator ) )
                    // InternalSiriusTextDsl.g:2388:1: (lv_sourceArrow_13_0= ruleArrowDecorator )
                    {
                    // InternalSiriusTextDsl.g:2388:1: (lv_sourceArrow_13_0= ruleArrowDecorator )
                    // InternalSiriusTextDsl.g:2389:3: lv_sourceArrow_13_0= ruleArrowDecorator
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getSourceArrowArrowDecoratorEnumRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_72);
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

            // InternalSiriusTextDsl.g:2405:4: (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==65) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSiriusTextDsl.g:2405:6: otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) )
                    {
                    otherlv_14=(Token)match(input,65,FOLLOW_15); 

                        	newLeafNode(otherlv_14, grammarAccess.getEdgeStyleAccess().getTargetArrowKeyword_8_0());
                        
                    otherlv_15=(Token)match(input,20,FOLLOW_71); 

                        	newLeafNode(otherlv_15, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_8_1());
                        
                    // InternalSiriusTextDsl.g:2413:1: ( (lv_targetArrow_16_0= ruleArrowDecorator ) )
                    // InternalSiriusTextDsl.g:2414:1: (lv_targetArrow_16_0= ruleArrowDecorator )
                    {
                    // InternalSiriusTextDsl.g:2414:1: (lv_targetArrow_16_0= ruleArrowDecorator )
                    // InternalSiriusTextDsl.g:2415:3: lv_targetArrow_16_0= ruleArrowDecorator
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getTargetArrowArrowDecoratorEnumRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_73);
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

            // InternalSiriusTextDsl.g:2431:4: (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==66) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSiriusTextDsl.g:2431:6: otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) )
                    {
                    otherlv_17=(Token)match(input,66,FOLLOW_15); 

                        	newLeafNode(otherlv_17, grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_18, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_9_1());
                        
                    // InternalSiriusTextDsl.g:2439:1: ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:2440:1: (lv_sizeComputationExpression_19_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:2440:1: (lv_sizeComputationExpression_19_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:2441:3: lv_sizeComputationExpression_19_0= RULE_EXPRESSION
                    {
                    lv_sizeComputationExpression_19_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_74); 

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

            // InternalSiriusTextDsl.g:2457:4: (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==67) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSiriusTextDsl.g:2457:6: otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) )
                    {
                    otherlv_20=(Token)match(input,67,FOLLOW_15); 

                        	newLeafNode(otherlv_20, grammarAccess.getEdgeStyleAccess().getFoldingStyleKeyword_10_0());
                        
                    otherlv_21=(Token)match(input,20,FOLLOW_75); 

                        	newLeafNode(otherlv_21, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_10_1());
                        
                    // InternalSiriusTextDsl.g:2465:1: ( (lv_foldingStyle_22_0= ruleFoldingStyle ) )
                    // InternalSiriusTextDsl.g:2466:1: (lv_foldingStyle_22_0= ruleFoldingStyle )
                    {
                    // InternalSiriusTextDsl.g:2466:1: (lv_foldingStyle_22_0= ruleFoldingStyle )
                    // InternalSiriusTextDsl.g:2467:3: lv_foldingStyle_22_0= ruleFoldingStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getFoldingStyleFoldingStyleEnumRuleCall_10_2_0()); 
                    	    
                    pushFollow(FOLLOW_76);
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

            // InternalSiriusTextDsl.g:2483:4: (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==68) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSiriusTextDsl.g:2483:6: otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) )
                    {
                    otherlv_23=(Token)match(input,68,FOLLOW_15); 

                        	newLeafNode(otherlv_23, grammarAccess.getEdgeStyleAccess().getEndsCenteringKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,20,FOLLOW_77); 

                        	newLeafNode(otherlv_24, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:2491:1: ( (lv_endsCentering_25_0= ruleEndsCentering ) )
                    // InternalSiriusTextDsl.g:2492:1: (lv_endsCentering_25_0= ruleEndsCentering )
                    {
                    // InternalSiriusTextDsl.g:2492:1: (lv_endsCentering_25_0= ruleEndsCentering )
                    // InternalSiriusTextDsl.g:2493:3: lv_endsCentering_25_0= ruleEndsCentering
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getEndsCenteringEndsCenteringEnumRuleCall_11_2_0()); 
                    	    
                    pushFollow(FOLLOW_21);
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

            otherlv_26=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2521:1: entryRulePalette returns [EObject current=null] : iv_rulePalette= rulePalette EOF ;
    public final EObject entryRulePalette() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePalette = null;


        try {
            // InternalSiriusTextDsl.g:2522:2: (iv_rulePalette= rulePalette EOF )
            // InternalSiriusTextDsl.g:2523:2: iv_rulePalette= rulePalette EOF
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
    // InternalSiriusTextDsl.g:2530:1: rulePalette returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) ;
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
            // InternalSiriusTextDsl.g:2533:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) )
            // InternalSiriusTextDsl.g:2534:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            {
            // InternalSiriusTextDsl.g:2534:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            // InternalSiriusTextDsl.g:2534:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}'
            {
            // InternalSiriusTextDsl.g:2534:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_DOCUMENTATION) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSiriusTextDsl.g:2535:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:2535:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:2536:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_78); 

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

            otherlv_1=(Token)match(input,69,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getPaletteAccess().getPaletteKeyword_1());
                
            // InternalSiriusTextDsl.g:2556:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:2557:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:2557:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:2558:3: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,16,FOLLOW_79); 

                	newLeafNode(otherlv_3, grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:2578:1: ( (lv_colors_4_0= ruleColor ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==70) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2579:1: (lv_colors_4_0= ruleColor )
            	    {
            	    // InternalSiriusTextDsl.g:2579:1: (lv_colors_4_0= ruleColor )
            	    // InternalSiriusTextDsl.g:2580:3: lv_colors_4_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_79);
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
            	    break loop65;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2608:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalSiriusTextDsl.g:2609:2: (iv_ruleColor= ruleColor EOF )
            // InternalSiriusTextDsl.g:2610:2: iv_ruleColor= ruleColor EOF
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
    // InternalSiriusTextDsl.g:2617:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2620:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) )
            // InternalSiriusTextDsl.g:2621:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            {
            // InternalSiriusTextDsl.g:2621:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            // InternalSiriusTextDsl.g:2621:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
                
            // InternalSiriusTextDsl.g:2625:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:2626:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:2626:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:2627:3: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_80); 

                	newLeafNode(otherlv_2, grammarAccess.getColorAccess().getEqualsSignKeyword_2());
                
            // InternalSiriusTextDsl.g:2647:1: ( (lv_value_3_0= ruleColorValue ) )
            // InternalSiriusTextDsl.g:2648:1: (lv_value_3_0= ruleColorValue )
            {
            // InternalSiriusTextDsl.g:2648:1: (lv_value_3_0= ruleColorValue )
            // InternalSiriusTextDsl.g:2649:3: lv_value_3_0= ruleColorValue
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
    // InternalSiriusTextDsl.g:2673:1: entryRuleColorValue returns [EObject current=null] : iv_ruleColorValue= ruleColorValue EOF ;
    public final EObject entryRuleColorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValue = null;


        try {
            // InternalSiriusTextDsl.g:2674:2: (iv_ruleColorValue= ruleColorValue EOF )
            // InternalSiriusTextDsl.g:2675:2: iv_ruleColorValue= ruleColorValue EOF
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
    // InternalSiriusTextDsl.g:2682:1: ruleColorValue returns [EObject current=null] : this_RGB_0= ruleRGB ;
    public final EObject ruleColorValue() throws RecognitionException {
        EObject current = null;

        EObject this_RGB_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2685:28: (this_RGB_0= ruleRGB )
            // InternalSiriusTextDsl.g:2687:5: this_RGB_0= ruleRGB
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
    // InternalSiriusTextDsl.g:2703:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // InternalSiriusTextDsl.g:2704:2: (iv_ruleRGB= ruleRGB EOF )
            // InternalSiriusTextDsl.g:2705:2: iv_ruleRGB= ruleRGB EOF
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
    // InternalSiriusTextDsl.g:2712:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_red_1_0=null;
        Token otherlv_2=null;
        Token lv_green_3_0=null;
        Token otherlv_4=null;
        Token lv_blue_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2715:28: ( (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // InternalSiriusTextDsl.g:2716:1: (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // InternalSiriusTextDsl.g:2716:1: (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' )
            // InternalSiriusTextDsl.g:2716:3: otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_57); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRgbKeyword_0());
                
            // InternalSiriusTextDsl.g:2720:1: ( (lv_red_1_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:2721:1: (lv_red_1_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:2721:1: (lv_red_1_0= RULE_INT )
            // InternalSiriusTextDsl.g:2722:3: lv_red_1_0= RULE_INT
            {
            lv_red_1_0=(Token)match(input,RULE_INT,FOLLOW_81); 

            			newLeafNode(lv_red_1_0, grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"red",
                    		lv_red_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_57); 

                	newLeafNode(otherlv_2, grammarAccess.getRGBAccess().getCommaKeyword_2());
                
            // InternalSiriusTextDsl.g:2742:1: ( (lv_green_3_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:2743:1: (lv_green_3_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:2743:1: (lv_green_3_0= RULE_INT )
            // InternalSiriusTextDsl.g:2744:3: lv_green_3_0= RULE_INT
            {
            lv_green_3_0=(Token)match(input,RULE_INT,FOLLOW_81); 

            			newLeafNode(lv_green_3_0, grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"green",
                    		lv_green_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_57); 

                	newLeafNode(otherlv_4, grammarAccess.getRGBAccess().getCommaKeyword_4());
                
            // InternalSiriusTextDsl.g:2764:1: ( (lv_blue_5_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:2765:1: (lv_blue_5_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:2765:1: (lv_blue_5_0= RULE_INT )
            // InternalSiriusTextDsl.g:2766:3: lv_blue_5_0= RULE_INT
            {
            lv_blue_5_0=(Token)match(input,RULE_INT,FOLLOW_82); 

            			newLeafNode(lv_blue_5_0, grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"blue",
                    		lv_blue_5_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,72,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getRGBAccess().getRightParenthesisKeyword_6());
                

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
    // InternalSiriusTextDsl.g:2794:1: ruleLabelAlignment returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleLabelAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:2796:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalSiriusTextDsl.g:2797:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalSiriusTextDsl.g:2797:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt66=1;
                }
                break;
            case 74:
                {
                alt66=2;
                }
                break;
            case 75:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalSiriusTextDsl.g:2797:2: (enumLiteral_0= 'left' )
                    {
                    // InternalSiriusTextDsl.g:2797:2: (enumLiteral_0= 'left' )
                    // InternalSiriusTextDsl.g:2797:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2803:6: (enumLiteral_1= 'center' )
                    {
                    // InternalSiriusTextDsl.g:2803:6: (enumLiteral_1= 'center' )
                    // InternalSiriusTextDsl.g:2803:8: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2809:6: (enumLiteral_2= 'right' )
                    {
                    // InternalSiriusTextDsl.g:2809:6: (enumLiteral_2= 'right' )
                    // InternalSiriusTextDsl.g:2809:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2819:1: ruleGradientDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) ;
    public final Enumerator ruleGradientDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:2821:28: ( ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) )
            // InternalSiriusTextDsl.g:2822:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            {
            // InternalSiriusTextDsl.g:2822:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt67=1;
                }
                break;
            case 77:
                {
                alt67=2;
                }
                break;
            case 78:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalSiriusTextDsl.g:2822:2: (enumLiteral_0= 'oblique' )
                    {
                    // InternalSiriusTextDsl.g:2822:2: (enumLiteral_0= 'oblique' )
                    // InternalSiriusTextDsl.g:2822:4: enumLiteral_0= 'oblique'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2828:6: (enumLiteral_1= 'lefttoright' )
                    {
                    // InternalSiriusTextDsl.g:2828:6: (enumLiteral_1= 'lefttoright' )
                    // InternalSiriusTextDsl.g:2828:8: enumLiteral_1= 'lefttoright'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2834:6: (enumLiteral_2= 'toptobottom' )
                    {
                    // InternalSiriusTextDsl.g:2834:6: (enumLiteral_2= 'toptobottom' )
                    // InternalSiriusTextDsl.g:2834:8: enumLiteral_2= 'toptobottom'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2844:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:2846:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) )
            // InternalSiriusTextDsl.g:2847:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            {
            // InternalSiriusTextDsl.g:2847:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt68=1;
                }
                break;
            case 80:
                {
                alt68=2;
                }
                break;
            case 81:
                {
                alt68=3;
                }
                break;
            case 82:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalSiriusTextDsl.g:2847:2: (enumLiteral_0= 'solid' )
                    {
                    // InternalSiriusTextDsl.g:2847:2: (enumLiteral_0= 'solid' )
                    // InternalSiriusTextDsl.g:2847:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2853:6: (enumLiteral_1= 'dash' )
                    {
                    // InternalSiriusTextDsl.g:2853:6: (enumLiteral_1= 'dash' )
                    // InternalSiriusTextDsl.g:2853:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2859:6: (enumLiteral_2= 'dot' )
                    {
                    // InternalSiriusTextDsl.g:2859:6: (enumLiteral_2= 'dot' )
                    // InternalSiriusTextDsl.g:2859:8: enumLiteral_2= 'dot'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:2865:6: (enumLiteral_3= 'dash_dot' )
                    {
                    // InternalSiriusTextDsl.g:2865:6: (enumLiteral_3= 'dash_dot' )
                    // InternalSiriusTextDsl.g:2865:8: enumLiteral_3= 'dash_dot'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2875:1: ruleRoutingStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) ) ;
    public final Enumerator ruleRoutingStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:2877:28: ( ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) ) )
            // InternalSiriusTextDsl.g:2878:1: ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) )
            {
            // InternalSiriusTextDsl.g:2878:1: ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt69=1;
                }
                break;
            case 84:
                {
                alt69=2;
                }
                break;
            case 85:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalSiriusTextDsl.g:2878:2: (enumLiteral_0= 'straight' )
                    {
                    // InternalSiriusTextDsl.g:2878:2: (enumLiteral_0= 'straight' )
                    // InternalSiriusTextDsl.g:2878:4: enumLiteral_0= 'straight'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2884:6: (enumLiteral_1= 'manhattan' )
                    {
                    // InternalSiriusTextDsl.g:2884:6: (enumLiteral_1= 'manhattan' )
                    // InternalSiriusTextDsl.g:2884:8: enumLiteral_1= 'manhattan'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2890:6: (enumLiteral_2= 'tree' )
                    {
                    // InternalSiriusTextDsl.g:2890:6: (enumLiteral_2= 'tree' )
                    // InternalSiriusTextDsl.g:2890:8: enumLiteral_2= 'tree'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2900:1: ruleArrowDecorator returns [Enumerator current=null] : ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) ) ;
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
            // InternalSiriusTextDsl.g:2902:28: ( ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) ) )
            // InternalSiriusTextDsl.g:2903:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) )
            {
            // InternalSiriusTextDsl.g:2903:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) )
            int alt70=11;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt70=1;
                }
                break;
            case 87:
                {
                alt70=2;
                }
                break;
            case 88:
                {
                alt70=3;
                }
                break;
            case 89:
                {
                alt70=4;
                }
                break;
            case 90:
                {
                alt70=5;
                }
                break;
            case 91:
                {
                alt70=6;
                }
                break;
            case 92:
                {
                alt70=7;
                }
                break;
            case 93:
                {
                alt70=8;
                }
                break;
            case 94:
                {
                alt70=9;
                }
                break;
            case 95:
                {
                alt70=10;
                }
                break;
            case 96:
                {
                alt70=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalSiriusTextDsl.g:2903:2: (enumLiteral_0= 'NoDecoration' )
                    {
                    // InternalSiriusTextDsl.g:2903:2: (enumLiteral_0= 'NoDecoration' )
                    // InternalSiriusTextDsl.g:2903:4: enumLiteral_0= 'NoDecoration'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2909:6: (enumLiteral_1= 'OutputArrow' )
                    {
                    // InternalSiriusTextDsl.g:2909:6: (enumLiteral_1= 'OutputArrow' )
                    // InternalSiriusTextDsl.g:2909:8: enumLiteral_1= 'OutputArrow'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2915:6: (enumLiteral_2= 'InputArrow' )
                    {
                    // InternalSiriusTextDsl.g:2915:6: (enumLiteral_2= 'InputArrow' )
                    // InternalSiriusTextDsl.g:2915:8: enumLiteral_2= 'InputArrow'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:2921:6: (enumLiteral_3= 'OutputClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:2921:6: (enumLiteral_3= 'OutputClosedArrow' )
                    // InternalSiriusTextDsl.g:2921:8: enumLiteral_3= 'OutputClosedArrow'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:2927:6: (enumLiteral_4= 'InputClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:2927:6: (enumLiteral_4= 'InputClosedArrow' )
                    // InternalSiriusTextDsl.g:2927:8: enumLiteral_4= 'InputClosedArrow'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:2933:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:2933:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:2933:8: enumLiteral_5= 'OutputFillClosedArrow'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:2939:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:2939:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:2939:8: enumLiteral_6= 'InputFillClosedArrow'
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:2945:6: (enumLiteral_7= 'Diamond' )
                    {
                    // InternalSiriusTextDsl.g:2945:6: (enumLiteral_7= 'Diamond' )
                    // InternalSiriusTextDsl.g:2945:8: enumLiteral_7= 'Diamond'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:2951:6: (enumLiteral_8= 'FillDiamond' )
                    {
                    // InternalSiriusTextDsl.g:2951:6: (enumLiteral_8= 'FillDiamond' )
                    // InternalSiriusTextDsl.g:2951:8: enumLiteral_8= 'FillDiamond'
                    {
                    enumLiteral_8=(Token)match(input,94,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalSiriusTextDsl.g:2957:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    {
                    // InternalSiriusTextDsl.g:2957:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    // InternalSiriusTextDsl.g:2957:8: enumLiteral_9= 'InputArrowWithDiamond'
                    {
                    enumLiteral_9=(Token)match(input,95,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalSiriusTextDsl.g:2963:6: (enumLiteral_10= 'InputArrowWithFillDiamond' )
                    {
                    // InternalSiriusTextDsl.g:2963:6: (enumLiteral_10= 'InputArrowWithFillDiamond' )
                    // InternalSiriusTextDsl.g:2963:8: enumLiteral_10= 'InputArrowWithFillDiamond'
                    {
                    enumLiteral_10=(Token)match(input,96,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2973:1: ruleFoldingStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) ) ;
    public final Enumerator ruleFoldingStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:2975:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) ) )
            // InternalSiriusTextDsl.g:2976:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) )
            {
            // InternalSiriusTextDsl.g:2976:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt71=1;
                }
                break;
            case 98:
                {
                alt71=2;
                }
                break;
            case 99:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalSiriusTextDsl.g:2976:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSiriusTextDsl.g:2976:2: (enumLiteral_0= 'none' )
                    // InternalSiriusTextDsl.g:2976:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2982:6: (enumLiteral_1= 'source' )
                    {
                    // InternalSiriusTextDsl.g:2982:6: (enumLiteral_1= 'source' )
                    // InternalSiriusTextDsl.g:2982:8: enumLiteral_1= 'source'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2988:6: (enumLiteral_2= 'target' )
                    {
                    // InternalSiriusTextDsl.g:2988:6: (enumLiteral_2= 'target' )
                    // InternalSiriusTextDsl.g:2988:8: enumLiteral_2= 'target'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); 

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
    // InternalSiriusTextDsl.g:2998:1: ruleEndsCentering returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) ) ;
    public final Enumerator ruleEndsCentering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:3000:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) ) )
            // InternalSiriusTextDsl.g:3001:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) )
            {
            // InternalSiriusTextDsl.g:3001:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt72=1;
                }
                break;
            case 100:
                {
                alt72=2;
                }
                break;
            case 98:
                {
                alt72=3;
                }
                break;
            case 99:
                {
                alt72=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalSiriusTextDsl.g:3001:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSiriusTextDsl.g:3001:2: (enumLiteral_0= 'none' )
                    // InternalSiriusTextDsl.g:3001:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:3007:6: (enumLiteral_1= 'both' )
                    {
                    // InternalSiriusTextDsl.g:3007:6: (enumLiteral_1= 'both' )
                    // InternalSiriusTextDsl.g:3007:8: enumLiteral_1= 'both'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:3013:6: (enumLiteral_2= 'source' )
                    {
                    // InternalSiriusTextDsl.g:3013:6: (enumLiteral_2= 'source' )
                    // InternalSiriusTextDsl.g:3013:8: enumLiteral_2= 'source'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:3019:6: (enumLiteral_3= 'target' )
                    {
                    // InternalSiriusTextDsl.g:3019:6: (enumLiteral_3= 'target' )
                    // InternalSiriusTextDsl.g:3019:8: enumLiteral_3= 'target'
                    {
                    enumLiteral_3=(Token)match(input,99,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x220119003C006010L,0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000030A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000F800020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000F000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000E000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000C000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000600000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x01A8000001020000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x01A0000001020000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0180000001020000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0180000000020000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xC000000000010000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x8000000000010000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000020000L,0x000000000000001FL});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x00000001FFC00000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000020000L,0x000000000000001EL});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000020000L,0x000000000000001CL});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000018L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});

}